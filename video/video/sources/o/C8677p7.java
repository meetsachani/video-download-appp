package o;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: o.p7  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8677p7 extends AbstractC7112il {
    public final EI0 a;

    public C8677p7(EI0 ei0) {
        this.a = ei0;
    }

    @Override // o.AbstractC7112il
    public CI0 b(AbstractC5091aS1<?> abstractC5091aS1, Map<String, String> map) throws IOException, C4118Rh {
        try {
            HttpResponse a = this.a.a(abstractC5091aS1, map);
            int statusCode = a.getStatusLine().getStatusCode();
            Header[] allHeaders = a.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new MG0(header.getName(), header.getValue()));
            }
            if (a.getEntity() == null) {
                return new CI0(statusCode, arrayList);
            }
            long contentLength = a.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new CI0(statusCode, arrayList, (int) a.getEntity().getContentLength(), a.getEntity().getContent());
            }
            throw new IOException("Response too large: " + contentLength);
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
