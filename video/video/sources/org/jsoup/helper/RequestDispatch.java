package org.jsoup.helper;

import java.lang.reflect.Constructor;
import org.jsoup.helper.HttpConnection;
import org.jsoup.internal.SharedConstants;

/* loaded from: classes4.dex */
class RequestDispatch {
    public static Constructor<RequestExecutor> a;

    static {
        try {
            a = Class.forName("org.jsoup.helper.HttpClientExecutor").getConstructor(HttpConnection.Request.class, HttpConnection.Response.class);
        } catch (Exception unused) {
        }
    }

    public static RequestExecutor a(HttpConnection.Request request, HttpConnection.Response response) {
        Constructor<RequestExecutor> constructor;
        boolean parseBoolean = Boolean.parseBoolean(System.getProperty(SharedConstants.i, "true"));
        if (request.z() != null) {
            parseBoolean = false;
        }
        if (parseBoolean && (constructor = a) != null) {
            try {
                return constructor.newInstance(request, response);
            } catch (Exception unused) {
                return new UrlConnectionExecutor(request, response);
            }
        }
        return new UrlConnectionExecutor(request, response);
    }
}
