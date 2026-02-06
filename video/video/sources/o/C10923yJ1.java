package o;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/* renamed from: o.yJ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10923yJ1 extends AbstractC9882u3 {
    public static final C10923yJ1 c = new C10923yJ1();
    public static final String d = "::";

    public static String g(String str, String str2) {
        return AbstractC9882u3.f(str, d, str2);
    }

    @Override // o.InterfaceC10759xe2
    public String lookup(String str) {
        Path path;
        InputStream newInputStream;
        if (str == null) {
            return null;
        }
        String[] split = str.split(d);
        if (split.length >= 2) {
            String str2 = split[0];
            String j3 = C4500Ve2.j3(str, d);
            try {
                Properties properties = new Properties();
                path = Paths.get(str2, new String[0]);
                newInputStream = Files.newInputStream(path, new OpenOption[0]);
                properties.load(newInputStream);
                if (newInputStream != null) {
                    newInputStream.close();
                }
                return properties.getProperty(j3);
            } catch (Exception e) {
                throw C6036eM0.b(e, "Error looking up properties [%s] and key [%s].", str2, j3);
            }
        }
        throw C6036eM0.a("Bad properties key format [%s]; expected format is %s.", str, g("DocumentPath", "Key"));
    }
}
