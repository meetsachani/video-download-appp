package o;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* renamed from: o.xp0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10801xp0 extends AbstractC9882u3 {
    public static final AbstractC9882u3 c = new C10801xp0();

    @Override // o.InterfaceC10759xe2
    public String lookup(String str) {
        Path path;
        byte[] readAllBytes;
        if (str == null) {
            return null;
        }
        String[] split = str.split(String.valueOf(':'));
        if (split.length >= 2) {
            String str2 = split[0];
            String i3 = C4500Ve2.i3(str, 58);
            try {
                path = Paths.get(i3, new String[0]);
                readAllBytes = Files.readAllBytes(path);
                return new String(readAllBytes, str2);
            } catch (Exception e) {
                throw C6036eM0.b(e, "Error looking up file [%s] with charset [%s].", i3, str2);
            }
        }
        throw C6036eM0.a("Bad file key format [%s], expected format is CharsetName:DocumentPath.", str);
    }
}
