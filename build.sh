echo "Pulling Lucene Solr code from Github"
ant pull
cd lucene-solr
ant ivy-bootstrap
cd ../
echo "Compiling Lucene Solr code"
ant compile
ant server
cd solr-samples
echo "Compiling custom Solr Plugin code"
mvn clean
mvn package
cd ../
echo "Deploying custom Solr Plugin code"
ant package
cd deploy
chmod +x restart-solr.sh
chmod +x restart-solr-dbg.sh
chmod +x feed.sh
chmod +x solr/bin/solr
echo "Starting Solr"
./restart-solr.sh
cd ../
echo "Loading 'solr-samples' core with data"
./configs/feed.sh configs/exampledocs solr-samples

