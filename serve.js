const express = require('express')

const graphqlHTTP = require('express-graphql')

const app = express()

const schema = require('./schema')

app.use('/graphqldemo',graphqlHTTP({
    schema,
    graphiql:true
}))

app.listen(5200)

console.log("Listening GraphQLDemo App ...")
