import groovy.json.JsonSlurper

someVar = 'This is a string'

def getJson(url) {
    new JsonSlurper().parseText(new URL(url).text)
}
