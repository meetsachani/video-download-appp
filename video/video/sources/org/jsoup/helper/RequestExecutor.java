package org.jsoup.helper;

import java.io.IOException;
import java.io.InputStream;
import org.jsoup.helper.HttpConnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class RequestExecutor {
    public final HttpConnection.Request a;
    public final HttpConnection.Response b;

    public RequestExecutor(HttpConnection.Request request, HttpConnection.Response response) {
        this.a = request;
        this.b = response;
    }

    public abstract HttpConnection.Response a() throws IOException;

    public abstract InputStream b() throws IOException;

    public abstract void c();
}
