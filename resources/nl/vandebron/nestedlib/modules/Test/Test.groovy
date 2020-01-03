echo "mpl-nested Test.groovy"

def sbtHome = tool 'sbtLatest'
env.sbt = "${sbtHome}/bin/sbt"

sh "${sbt} test"
