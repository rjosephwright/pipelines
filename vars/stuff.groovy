import groovy.json.JsonSlurperClassic

someVar = 'This is a string'

def getJson(url) {
    new JsonSlurperClassic().parseText(new URL(url).text)
}
