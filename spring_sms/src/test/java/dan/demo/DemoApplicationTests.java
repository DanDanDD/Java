package dan.demo;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
            // 连接阿里云
            DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4G1XM7DyqGDWDPdeKcWF", "yyoPCVGWw3TisU2EZ6uapDqlJOY4vY\n");
            IAcsClient client = new DefaultAcsClient(profile);
            // 构建请求
            CommonRequest request = new CommonRequest();

            request.setSysMethod(MethodType.POST);
            request.setSysDomain("dysmsapi.aliyuncs.com");
            request.setSysVersion("2017-05-25");
            request.setSysAction("SendSms");

            // 自定义参数 (手机号，验证码，签名，模板)
        request.putQueryParameter("phoneNumbers", "cn-hangzhou");
        request.putQueryParameter("${code}", "cn-hangzhou");
        request.putQueryParameter("", "cn-hangzhou");


        try {
                CommonResponse response = client.getCommonResponse(request);
                System.out.println(response.getData());
            } catch (ServerException e) {
                e.printStackTrace();
            } catch (ClientException e) {
                e.printStackTrace();
            }
    }

}
