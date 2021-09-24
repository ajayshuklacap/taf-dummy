import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
public class javaRequest extends AbstractJavaSamplerClient {

        @Override
        public void setupTest(JavaSamplerContext context){
        // TODO Auto-generated method stub

        super.setupTest(context);
        }
        @Override
        public Arguments getDefaultParameters() {
        // TODO Auto-generated method stub  


        }
        @Override
        public SampleResult runTest(JavaSamplerContext arg0) {
            // TODO Auto-generated method stub

            SampleResult result = new SampleResult();

                boolean success = true;

                result.sampleStart();

                // Write your test code here.

                //


                result.sampleEnd();

                result.setSuccessful(success);

                return result;

        }
        @Override
        public void teardownTest(JavaSamplerContext context){
            // TODO Auto-generated method stub
            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
                System.out.println(verificationErrorString); 
            }
            super.teardownTest(context);
        }
}