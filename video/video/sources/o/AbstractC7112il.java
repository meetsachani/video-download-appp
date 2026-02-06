package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: o.il  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7112il implements EI0 {
    @Override // o.EI0
    @Deprecated
    public final HttpResponse a(AbstractC5091aS1<?> abstractC5091aS1, Map<String, String> map) throws IOException, C4118Rh {
        CI0 b = b(abstractC5091aS1, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), b.e(), ""));
        ArrayList arrayList = new ArrayList();
        for (MG0 mg0 : b.d()) {
            arrayList.add(new BasicHeader(mg0.a(), mg0.b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[0]));
        InputStream a = b.a();
        if (a != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(a);
            basicHttpEntity.setContentLength(b.c());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    public abstract CI0 b(AbstractC5091aS1<?> abstractC5091aS1, Map<String, String> map) throws IOException, C4118Rh;
}
