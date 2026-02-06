package o;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.xml.xpath.XPathFactory;
import org.xml.sax.InputSource;

/* renamed from: o.cO2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5561cO2 extends AbstractC9882u3 {
    public static final C5561cO2 c = new C5561cO2();

    @Override // o.InterfaceC10759xe2
    public String lookup(String str) {
        Path path;
        InputStream newInputStream;
        if (str == null) {
            return null;
        }
        String[] split = str.split(AbstractC9882u3.b);
        if (split.length == 2) {
            String str2 = split[0];
            String i3 = C4500Ve2.i3(str, 58);
            try {
                path = Paths.get(str2, new String[0]);
                newInputStream = Files.newInputStream(path, new OpenOption[0]);
                String evaluate = XPathFactory.newInstance().newXPath().evaluate(i3, new InputSource(newInputStream));
                if (newInputStream != null) {
                    newInputStream.close();
                    return evaluate;
                }
                return evaluate;
            } catch (Exception e) {
                throw C6036eM0.b(e, "Error looking up XML document [%s] and XPath [%s].", str2, i3);
            }
        }
        throw C6036eM0.a("Bad XML key format [%s]; expected format is DocumentPath:XPath.", str);
    }
}
