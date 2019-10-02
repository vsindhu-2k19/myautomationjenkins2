import groovy.json.JsonSlurperClassic

cDelivery = readFile "$wrks/config/cpl4.json"
def jString = new JsonSlurperClassic().parseText(cDelivery)
def bStr = jString.btool
bStr = bStr + " -f appl/pom.xml " + jString.target
sh "$bStr"
