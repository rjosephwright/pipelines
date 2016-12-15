import groovy.json.JsonSlurperClassic

someVar = 'This is a string'

def getJson(url) {
    new JsonSlurper().parseText(new URL(url).text)
}
