package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C4972Zy1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nNioFileSystemWrappingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,192:1\n1620#2,3:193\n1#3:196\n37#4,2:197\n37#4,2:199\n37#4,2:201\n*S KotlinDebug\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n*L\n77#1:193,3\n104#1:197,2\n125#1:199,2\n138#1:201,2\n*E\n"})
/* renamed from: o.lq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7862lq1 extends C9831tq1 {
    @NotNull
    public final FileSystem e;

    public C7862lq1(@NotNull FileSystem fileSystem) {
        C6562gT0.p(fileSystem, "nioFileSystem");
        this.e = fileSystem;
    }

    @Override // o.C9831tq1, o.C10240vW0, o.AbstractC2576Bp0
    @Nullable
    public C9340rp0 E(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "path");
        return Q(S(c4972Zy1));
    }

    @Override // o.C10240vW0, o.AbstractC2576Bp0
    @NotNull
    public AbstractC8848pp0 F(@NotNull C4972Zy1 c4972Zy1) {
        StandardOpenOption standardOpenOption;
        FileChannel open;
        C6562gT0.p(c4972Zy1, "file");
        try {
            Path S = S(c4972Zy1);
            standardOpenOption = StandardOpenOption.READ;
            open = FileChannel.open(S, standardOpenOption);
            C6562gT0.m(open);
            return new C5908dq1(false, open);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + c4972Zy1);
        }
    }

    @Override // o.C10240vW0, o.AbstractC2576Bp0
    @NotNull
    public AbstractC8848pp0 H(@NotNull C4972Zy1 c4972Zy1, boolean z, boolean z2) {
        StandardOpenOption standardOpenOption;
        StandardOpenOption standardOpenOption2;
        FileChannel open;
        C6562gT0.p(c4972Zy1, "file");
        if (z && z2) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        List i = C7979mF.i();
        standardOpenOption = StandardOpenOption.READ;
        i.add(standardOpenOption);
        standardOpenOption2 = StandardOpenOption.WRITE;
        i.add(standardOpenOption2);
        if (z) {
            i.add(C7134iq1.a());
        } else if (!z2) {
            i.add(C7376jq1.a());
        }
        List a = C7979mF.a(i);
        try {
            Path S = S(c4972Zy1);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a.toArray(new StandardOpenOption[0]);
            open = FileChannel.open(S, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            C6562gT0.m(open);
            return new C5908dq1(true, open);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + c4972Zy1);
        }
    }

    @Override // o.C10240vW0, o.AbstractC2576Bp0
    @NotNull
    public J82 K(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        OutputStream newOutputStream;
        C6562gT0.p(c4972Zy1, "file");
        List i = C7979mF.i();
        if (z) {
            i.add(C7134iq1.a());
        }
        List a = C7979mF.a(i);
        try {
            Path S = S(c4972Zy1);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            newOutputStream = Files.newOutputStream(S, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            C6562gT0.o(newOutputStream, "newOutputStream(this, *options)");
            return C9604su1.p(newOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + c4972Zy1);
        }
    }

    @Override // o.C10240vW0, o.AbstractC2576Bp0
    @NotNull
    public InterfaceC7072ia2 M(@NotNull C4972Zy1 c4972Zy1) {
        InputStream newInputStream;
        C6562gT0.p(c4972Zy1, "file");
        try {
            newInputStream = Files.newInputStream(S(c4972Zy1), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            C6562gT0.o(newInputStream, "newInputStream(this, *options)");
            return C9604su1.u(newInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + c4972Zy1);
        }
    }

    public final List<C4972Zy1> N(C4972Zy1 c4972Zy1, boolean z) {
        boolean exists;
        Path S = S(c4972Zy1);
        try {
            List<Object> u1 = C5997eC1.u1(S, null, 1, null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : u1) {
                arrayList.add(C4972Zy1.a.i(C4972Zy1.Y, N30.a(obj), false, 1, null));
            }
            C9201rF.m0(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (z) {
                exists = Files.exists(S, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
                if (!exists) {
                    throw new FileNotFoundException("no such file: " + c4972Zy1);
                }
                throw new IOException("failed to list " + c4972Zy1);
            }
            return null;
        }
    }

    public final Path S(C4972Zy1 c4972Zy1) {
        Path path;
        path = this.e.getPath(c4972Zy1.toString(), new String[0]);
        C6562gT0.o(path, "getPath(...)");
        return path;
    }

    @Override // o.C10240vW0, o.AbstractC2576Bp0
    @NotNull
    public J82 e(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        StandardOpenOption standardOpenOption;
        OutputStream newOutputStream;
        C6562gT0.p(c4972Zy1, "file");
        List i = C7979mF.i();
        standardOpenOption = StandardOpenOption.APPEND;
        i.add(standardOpenOption);
        if (!z) {
            i.add(C7376jq1.a());
        }
        List a = C7979mF.a(i);
        Path S = S(c4972Zy1);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        newOutputStream = Files.newOutputStream(S, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C6562gT0.o(newOutputStream, "newOutputStream(this, *options)");
        return C9604su1.p(newOutputStream);
    }

    @Override // o.C9831tq1, o.C10240vW0, o.AbstractC2576Bp0
    public void g(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        Path move;
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        try {
            Path S = S(c4972Zy1);
            Path S2 = S(c4972Zy12);
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            move = Files.move(S, S2, (CopyOption[]) Arrays.copyOf(new CopyOption[]{standardCopyOption, standardCopyOption2}, 2));
            C6562gT0.o(move, "move(this, target, *options)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            message = e.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // o.C10240vW0, o.AbstractC2576Bp0
    @NotNull
    public C4972Zy1 h(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "path");
        try {
            C4972Zy1.a aVar = C4972Zy1.Y;
            Path a = C7965mB1.a(S(c4972Zy1), new LinkOption[0]);
            C6562gT0.o(a, "toRealPath(...)");
            return C4972Zy1.a.i(aVar, a, false, 1, null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + c4972Zy1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r0.j() == true) goto L5;
     */
    @Override // o.C10240vW0, o.AbstractC2576Bp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        boolean z2;
        Path createDirectory;
        C6562gT0.p(c4972Zy1, "dir");
        C9340rp0 E = E(c4972Zy1);
        if (E != null) {
            z2 = true;
        }
        z2 = false;
        if (!z2 || !z) {
            try {
                createDirectory = Files.createDirectory(S(c4972Zy1), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0));
                C6562gT0.o(createDirectory, "createDirectory(this, *attributes)");
                return;
            } catch (IOException e) {
                if (z2) {
                    return;
                }
                throw new IOException("failed to create directory: " + c4972Zy1, e);
            }
        }
        throw new IOException(c4972Zy1 + " already exists.");
    }

    @Override // o.C9831tq1, o.C10240vW0, o.AbstractC2576Bp0
    public void p(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
        Path createSymbolicLink;
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        createSymbolicLink = Files.createSymbolicLink(S(c4972Zy1), S(c4972Zy12), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0));
        C6562gT0.o(createSymbolicLink, "createSymbolicLink(this, target, *attributes)");
    }

    @Override // o.C10240vW0, o.AbstractC2576Bp0
    public void r(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        boolean exists;
        C6562gT0.p(c4972Zy1, "path");
        if (!Thread.interrupted()) {
            Path S = S(c4972Zy1);
            try {
                Files.delete(S);
                return;
            } catch (NoSuchFileException unused) {
                if (!z) {
                    return;
                }
                throw new FileNotFoundException("no such file: " + c4972Zy1);
            } catch (IOException unused2) {
                exists = Files.exists(S, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
                if (exists) {
                    throw new IOException("failed to delete " + c4972Zy1);
                }
                return;
            }
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // o.C9831tq1, o.C10240vW0
    @NotNull
    public String toString() {
        String V = C6551gQ1.d(this.e.getClass()).V();
        C6562gT0.m(V);
        return V;
    }

    @Override // o.C10240vW0, o.AbstractC2576Bp0
    @NotNull
    public List<C4972Zy1> y(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "dir");
        List<C4972Zy1> N = N(c4972Zy1, true);
        C6562gT0.m(N);
        return N;
    }

    @Override // o.C10240vW0, o.AbstractC2576Bp0
    @Nullable
    public List<C4972Zy1> z(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "dir");
        return N(c4972Zy1, false);
    }
}
