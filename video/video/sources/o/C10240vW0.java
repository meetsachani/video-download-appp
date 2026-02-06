package o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import o.C4972Zy1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11400#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"})
/* renamed from: o.vW0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10240vW0 extends AbstractC2576Bp0 {
    private final List<C4972Zy1> N(C4972Zy1 c4972Zy1, boolean z) {
        File file = c4972Zy1.toFile();
        String[] list = file.list();
        if (list == null) {
            if (z) {
                if (!file.exists()) {
                    throw new FileNotFoundException("no such file: " + c4972Zy1);
                }
                throw new IOException("failed to list " + c4972Zy1);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            C6562gT0.m(str);
            arrayList.add(c4972Zy1.y(str));
        }
        C9201rF.m0(arrayList);
        return arrayList;
    }

    @Override // o.AbstractC2576Bp0
    @Nullable
    public C9340rp0 E(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "path");
        File file = c4972Zy1.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new C9340rp0(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public AbstractC8848pp0 F(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "file");
        return new C7299jW0(false, new RandomAccessFile(c4972Zy1.toFile(), "r"));
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public AbstractC8848pp0 H(@NotNull C4972Zy1 c4972Zy1, boolean z, boolean z2) {
        C6562gT0.p(c4972Zy1, "file");
        if (z && z2) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z) {
            O(c4972Zy1);
        }
        if (z2) {
            P(c4972Zy1);
        }
        return new C7299jW0(true, new RandomAccessFile(c4972Zy1.toFile(), FN1.c1));
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public J82 K(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        J82 q;
        C6562gT0.p(c4972Zy1, "file");
        if (z) {
            O(c4972Zy1);
        }
        q = C9847tu1.q(c4972Zy1.toFile(), false, 1, null);
        return q;
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public InterfaceC7072ia2 M(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "file");
        return C9604su1.t(c4972Zy1.toFile());
    }

    public final void O(C4972Zy1 c4972Zy1) {
        if (!w(c4972Zy1)) {
            return;
        }
        throw new IOException(c4972Zy1 + " already exists.");
    }

    public final void P(C4972Zy1 c4972Zy1) {
        if (w(c4972Zy1)) {
            return;
        }
        throw new IOException(c4972Zy1 + " doesn't exist.");
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public J82 e(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "file");
        if (z) {
            P(c4972Zy1);
        }
        return C9604su1.o(c4972Zy1.toFile(), true);
    }

    @Override // o.AbstractC2576Bp0
    public void g(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        if (c4972Zy1.toFile().renameTo(c4972Zy12.toFile())) {
            return;
        }
        throw new IOException("failed to move " + c4972Zy1 + " to " + c4972Zy12);
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public C4972Zy1 h(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "path");
        File canonicalFile = c4972Zy1.toFile().getCanonicalFile();
        if (canonicalFile.exists()) {
            C4972Zy1.a aVar = C4972Zy1.Y;
            C6562gT0.m(canonicalFile);
            return C4972Zy1.a.g(aVar, canonicalFile, false, 1, null);
        }
        throw new FileNotFoundException("no such file");
    }

    @Override // o.AbstractC2576Bp0
    public void n(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "dir");
        if (!c4972Zy1.toFile().mkdir()) {
            C9340rp0 E = E(c4972Zy1);
            if (E != null && E.j()) {
                if (z) {
                    throw new IOException(c4972Zy1 + " already exists.");
                }
                return;
            }
            throw new IOException("failed to create directory: " + c4972Zy1);
        }
    }

    @Override // o.AbstractC2576Bp0
    public void p(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        throw new IOException("unsupported");
    }

    @Override // o.AbstractC2576Bp0
    public void r(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "path");
        if (!Thread.interrupted()) {
            File file = c4972Zy1.toFile();
            if (!file.delete()) {
                if (!file.exists()) {
                    if (z) {
                        throw new FileNotFoundException("no such file: " + c4972Zy1);
                    }
                    return;
                }
                throw new IOException("failed to delete " + c4972Zy1);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @NotNull
    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public List<C4972Zy1> y(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "dir");
        List<C4972Zy1> N = N(c4972Zy1, true);
        C6562gT0.m(N);
        return N;
    }

    @Override // o.AbstractC2576Bp0
    @Nullable
    public List<C4972Zy1> z(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "dir");
        return N(c4972Zy1, false);
    }
}
