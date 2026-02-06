package o;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

/* renamed from: o.Mz1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3700Mz1 {
    public static final boolean c(C9381rz1 c9381rz1) {
        boolean isSameFile;
        for (C9381rz1 c = c9381rz1.c(); c != null; c = c.c()) {
            if (c.b() == null || c9381rz1.b() == null) {
                try {
                    isSameFile = Files.isSameFile(c.d(), c9381rz1.d());
                    if (isSameFile) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (C6562gT0.g(c.b(), c9381rz1.b())) {
                return true;
            }
        }
        return false;
    }

    public static final Object d(Path path, LinkOption[] linkOptionArr) {
        BasicFileAttributes readAttributes;
        Object fileKey;
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            readAttributes = Files.readAttributes(path, C3407Jz1.a(), (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            C6562gT0.o(readAttributes, "readAttributes(...)");
            fileKey = readAttributes.fileKey();
            return fileKey;
        } catch (Throwable unused) {
            return null;
        }
    }
}
