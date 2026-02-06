package o;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.PrivilegedAction;
import java.util.Properties;

/* loaded from: classes4.dex */
public final class S31 implements PrivilegedAction {
    public final /* synthetic */ URL a;

    public S31(URL url) {
        this.a = url;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.security.PrivilegedAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object run() {
        InputStream inputStream;
        Throwable th;
        StringBuffer stringBuffer;
        try {
            URLConnection openConnection = this.a.openConnection();
            openConnection.setUseCaches(false);
            inputStream = openConnection.getInputStream();
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th2) {
            inputStream = null;
            th = th2;
            if (inputStream != null) {
            }
            throw th;
        }
        if (inputStream != null) {
            try {
                try {
                    Properties properties = new Properties();
                    properties.load(inputStream);
                    inputStream.close();
                    return properties;
                } catch (Throwable th3) {
                    th = th3;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                            if (U31.z()) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("Unable to close stream for URL ");
                                stringBuffer2.append(this.a);
                                U31.B(stringBuffer2.toString());
                            }
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
                if (U31.z()) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("Unable to read URL ");
                    stringBuffer3.append(this.a);
                    U31.B(stringBuffer3.toString());
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                        if (U31.z()) {
                            stringBuffer = new StringBuffer();
                            stringBuffer.append("Unable to close stream for URL ");
                            stringBuffer.append(this.a);
                            U31.B(stringBuffer.toString());
                        }
                    }
                }
                return null;
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused5) {
                if (U31.z()) {
                    stringBuffer = new StringBuffer();
                    stringBuffer.append("Unable to close stream for URL ");
                    stringBuffer.append(this.a);
                    U31.B(stringBuffer.toString());
                }
            }
        }
        return null;
    }
}
