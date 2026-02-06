package o;

import java.io.File;

/* renamed from: o.Mf0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3624Mf0 {
    public static final String b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(B8.d + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "toString(...)");
        return sb2;
    }
}
