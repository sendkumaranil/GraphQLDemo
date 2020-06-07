const fetch = require('node-fetch')
const util = require('util')
const parseXML = util.promisify(require('xml2js').parseString)

const  {
    GraphQLSchema,
    GraphQLObjectType,
    GraphQLString
} = require('graphql')

const CountryType = new GraphQLObjectType({
    name:'Country',
    descripion:'..',
    fields: ()=>({
        countryName:{
            type:GraphQLString,
            resolve: xml =>  xml.Array.countries[0].countryName[0]
        },
        capital:{
            type:GraphQLString,
            resolve: xml => xml.Array.countries[0].capital[0]
        },
        currency:{
            type:GraphQLString,
            resolve:xml => xml.Array.countries[0].currency[0]
        },
        language:{
            type:GraphQLString,
            resolve: xml => xml.Array.countries[0].language[0]
        }
    })
})

module.exports = new GraphQLSchema({
    query: new GraphQLObjectType({
        name:'GetCountry',
        descripion:'..',
        fields: () =>({
            country:{
                type:CountryType,
                args:{
                    countryCode:{type:GraphQLString}
                },
                resolve: (root,args) => fetch(
                    `https://anilverma4283-eval-test.apigee.net/countries?country-code=${args.countryCode}&apikey=9AB57MZRZUDKRc4re8QJRelsjJTGGQIO`
                )
                .then(response => response.text())
                .then(parseXML)
            }
        })
    })
})