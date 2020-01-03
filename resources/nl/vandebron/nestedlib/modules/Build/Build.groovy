echo "mpl-nested Build.groovy"

def sbtHome = tool 'sbtLatest'
env.sbt = "${sbtHome}/bin/sbt"

sh "${sbt} assembly"
