import javax.xml.xpath.*

val xPath = XPathFactory.newInstance().newXPath()
val component = xPath.evaluateExpression("/project/component", null)