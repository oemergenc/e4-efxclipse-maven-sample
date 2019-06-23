package sample.mvn.lib;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;
import org.osgeo.proj4j.ProjCoordinate;

import java.util.Arrays;
import java.util.List;

public class HelloWorldHelper {
    public static void helloWorld() {
        SparkSession spark = SparkSession.builder().appName("theApp").master("local").getOrCreate();
        JavaSparkContext sc = new JavaSparkContext(spark.sparkContext());
        List<Integer> collection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        JavaRDD<Integer> rdd = sc.parallelize(collection, 2);
        System.out.println("Number of partitions : " + rdd.getNumPartitions());

        org.osgeo.proj4j.ProjCoordinate coord = new ProjCoordinate();
        coord.setValue(19, 20);

        LombokPojo pojo = new LombokPojo();
        pojo.setAge("12");
        pojo.setName("deineMudda");
        System.err.println("Hello World from Helper!!   " + pojo + " " + coord);
    }
}
