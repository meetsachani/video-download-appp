package o;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;

/* renamed from: o.aD2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5032aD2 extends AbstractC9882u3 {
    public static final C5032aD2 c = new C5032aD2();

    @Override // o.InterfaceC10759xe2
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(AbstractC9882u3.b);
        if (split.length >= 2) {
            String str2 = split[0];
            String i3 = C4500Ve2.i3(str, 58);
            try {
                URL url = new URL(i3);
                StringWriter stringWriter = new StringWriter(8192);
                char[] cArr = new char[8192];
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream, str2);
                while (true) {
                    try {
                        int read = inputStreamReader.read(cArr);
                        if (-1 != read) {
                            stringWriter.write(cArr, 0, read);
                        } else {
                            inputStreamReader.close();
                            bufferedInputStream.close();
                            return stringWriter.toString();
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                inputStreamReader.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Exception e) {
                throw C6036eM0.b(e, "Error looking up URL [%s] with Charset [%s].", i3, str2);
            }
        } else {
            throw C6036eM0.a("Bad URL key format [%s]; expected format is DocumentPath:Key.", str);
        }
    }
}
