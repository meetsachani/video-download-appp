package o;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1563#2:150\n1634#2,3:151\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n134#1:150\n134#1:151,3\n*E\n"})
/* renamed from: o.br0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5427br0 {
    @NotNull
    public static final File a(@NotNull File file) {
        C6562gT0.p(file, "<this>");
        return new File(c(file));
    }

    public static final int b(String str) {
        int I3;
        char c = File.separatorChar;
        int I32 = C10763xf2.I3(str, c, 0, false, 4, null);
        if (I32 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (I3 = C10763xf2.I3(str, c, 2, false, 4, null)) < 0) {
                return 1;
            }
            int I33 = C10763xf2.I3(str, c, I3 + 1, false, 4, null);
            if (I33 >= 0) {
                return I33 + 1;
            }
            return str.length();
        } else if (I32 > 0 && str.charAt(I32 - 1) == ':') {
            return I32 + 1;
        } else {
            if (I32 != -1 || !C10763xf2.s3(str, ':', false, 2, null)) {
                return 0;
            }
            return str.length();
        }
    }

    @NotNull
    public static final String c(@NotNull File file) {
        C6562gT0.p(file, "<this>");
        String path = file.getPath();
        C6562gT0.o(path, "getPath(...)");
        String path2 = file.getPath();
        C6562gT0.o(path2, "getPath(...)");
        String substring = path.substring(0, b(path2));
        C6562gT0.o(substring, "substring(...)");
        return substring;
    }

    public static final boolean d(@NotNull File file) {
        C6562gT0.p(file, "<this>");
        String path = file.getPath();
        C6562gT0.o(path, "getPath(...)");
        if (b(path) > 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final File e(@NotNull File file, int i, int i2) {
        C6562gT0.p(file, "<this>");
        return f(file).j(i, i2);
    }

    @NotNull
    public static final C9826tp0 f(@NotNull File file) {
        List list;
        C6562gT0.p(file, "<this>");
        String path = file.getPath();
        C6562gT0.m(path);
        int b = b(path);
        String substring = path.substring(0, b);
        C6562gT0.o(substring, "substring(...)");
        String substring2 = path.substring(b);
        C6562gT0.o(substring2, "substring(...)");
        if (substring2.length() == 0) {
            list = C8222nF.H();
        } else {
            List<String> n5 = C10763xf2.n5(substring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(C8466oF.b0(n5, 10));
            for (String str : n5) {
                arrayList.add(new File(str));
            }
            list = arrayList;
        }
        return new C9826tp0(new File(substring), list);
    }
}
