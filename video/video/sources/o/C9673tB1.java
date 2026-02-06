package o;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,530:1\n376#1,2:534\n384#1:536\n384#1:537\n378#1,4:538\n376#1,2:542\n384#1:544\n378#1,4:545\n384#1:549\n376#1,6:550\n376#1,2:556\n384#1:558\n378#1,4:559\n1#2:531\n1869#3,2:532\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n392#1:534,2\n407#1:536\n410#1:537\n392#1:538,4\n418#1:542,2\n419#1:544\n418#1:545,4\n430#1:549\n438#1:550,6\n461#1:556,2\n462#1:558\n461#1:559,4\n314#1:532,2\n*E\n"})
/* renamed from: o.tB1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9673tB1 extends NA1 {

    /* renamed from: o.tB1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LP.values().length];
            try {
                iArr[LP.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LP.Z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LP.Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[EnumC4756Xu1.values().length];
            try {
                iArr2[EnumC4756Xu1.Y.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC4756Xu1.X.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    /* renamed from: o.tB1$b */
    /* loaded from: classes3.dex */
    public static final class b implements XA0 {
        public static final b X = new b();

        @Override // o.XA0
        public /* bridge */ /* synthetic */ Object P(Object obj, Object obj2, Object obj3) {
            return c(N30.a(obj), N30.a(obj2), (Exception) obj3);
        }

        public final Void c(Path path, Path path2, Exception exc) {
            C6562gT0.p(path, "<unused var>");
            C6562gT0.p(path2, "<unused var>");
            C6562gT0.p(exc, "exception");
            throw exc;
        }
    }

    /* renamed from: o.tB1$c */
    /* loaded from: classes3.dex */
    public static final class c implements XA0 {
        public static final c X = new c();

        @Override // o.XA0
        public /* bridge */ /* synthetic */ Object P(Object obj, Object obj2, Object obj3) {
            return c(N30.a(obj), N30.a(obj2), (Exception) obj3);
        }

        public final Void c(Path path, Path path2, Exception exc) {
            C6562gT0.p(path, "<unused var>");
            C6562gT0.p(path2, "<unused var>");
            C6562gT0.p(exc, "exception");
            throw exc;
        }
    }

    /* renamed from: o.tB1$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class d extends C7964mB0 implements VA0<Path, BasicFileAttributes, FileVisitResult> {
        public final /* synthetic */ ArrayList<Path> e1;
        public final /* synthetic */ XA0<KP, Path, Path, LP> f1;
        public final /* synthetic */ Path g1;
        public final /* synthetic */ Path h1;
        public final /* synthetic */ Path i1;
        public final /* synthetic */ XA0<Path, Path, Exception, EnumC4756Xu1> j1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(ArrayList<Path> arrayList, XA0<? super KP, ? super Path, ? super Path, ? extends LP> xa0, Path path, Path path2, Path path3, XA0<? super Path, ? super Path, ? super Exception, ? extends EnumC4756Xu1> xa02) {
            super(2, C6562gT0.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
            this.e1 = arrayList;
            this.f1 = xa0;
            this.g1 = path;
            this.h1 = path2;
            this.i1 = path3;
            this.j1 = xa02;
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ FileVisitResult i(Path path, BasicFileAttributes basicFileAttributes) {
            return u0(N30.a(path), C9916uB1.a(basicFileAttributes));
        }

        public final FileVisitResult u0(Path path, BasicFileAttributes basicFileAttributes) {
            C6562gT0.p(path, "p0");
            C6562gT0.p(basicFileAttributes, "p1");
            return C9673tB1.T(this.e1, this.f1, this.g1, this.h1, this.i1, this.j1, path, basicFileAttributes);
        }
    }

    /* renamed from: o.tB1$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class e extends C7964mB0 implements VA0<Path, Exception, FileVisitResult> {
        public final /* synthetic */ XA0<Path, Path, Exception, EnumC4756Xu1> e1;
        public final /* synthetic */ Path f1;
        public final /* synthetic */ Path g1;
        public final /* synthetic */ Path h1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(XA0<? super Path, ? super Path, ? super Exception, ? extends EnumC4756Xu1> xa0, Path path, Path path2, Path path3) {
            super(2, C6562gT0.a.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
            this.e1 = xa0;
            this.f1 = path;
            this.g1 = path2;
            this.h1 = path3;
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ FileVisitResult i(Path path, Exception exc) {
            return u0(N30.a(path), exc);
        }

        public final FileVisitResult u0(Path path, Exception exc) {
            C6562gT0.p(path, "p0");
            C6562gT0.p(exc, "p1");
            return C9673tB1.X(this.e1, this.f1, this.g1, this.h1, path, exc);
        }
    }

    public static final void O(@NotNull Path path) {
        C6562gT0.p(path, "<this>");
        String d1 = C5997eC1.d1(path);
        int hashCode = d1.hashCode();
        if (hashCode != 46) {
            if (hashCode != 1518) {
                if (hashCode != 45679) {
                    if (hashCode != 45724) {
                        if (hashCode != 1472) {
                            if (hashCode != 1473 || !d1.equals("./")) {
                                return;
                            }
                        } else if (!d1.equals("..")) {
                            return;
                        }
                    } else if (!d1.equals("..\\")) {
                        return;
                    }
                } else if (!d1.equals("../")) {
                    return;
                }
            } else if (!d1.equals(".\\")) {
                return;
            }
        } else if (!d1.equals(UE.h)) {
            return;
        }
        throw new C6279fM0(path);
    }

    public static final void P(Path path, Path path2) {
        boolean isSymbolicLink;
        boolean isSameFile;
        isSymbolicLink = Files.isSymbolicLink(path);
        if (!isSymbolicLink) {
            isSameFile = Files.isSameFile(path, path2);
            if (isSameFile) {
                C3211Hz1.a();
                throw C3113Gz1.a(path.toString());
            }
        }
    }

    public static final void Q(C2939Ff0 c2939Ff0, FA0<C7458kA2> fa0) {
        try {
            fa0.invoke();
        } catch (Exception e2) {
            c2939Ff0.a(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r7 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
        if (r3 == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    @InterfaceC4611Wi0
    @InterfaceC6480g82(version = "1.8")
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Path R(@NotNull final Path path, @NotNull final Path path2, @NotNull final XA0<? super Path, ? super Path, ? super Exception, ? extends EnumC4756Xu1> xa0, boolean z, @NotNull final XA0<? super KP, ? super Path, ? super Path, ? extends LP> xa02) {
        boolean exists;
        boolean exists2;
        final Path normalize;
        boolean exists3;
        boolean z2;
        FileSystem fileSystem;
        FileSystem fileSystem2;
        Path parent;
        boolean exists4;
        Path realPath;
        Path realPath2;
        boolean startsWith;
        Path realPath3;
        Path realPath4;
        boolean isSameFile;
        boolean isSymbolicLink;
        boolean isSymbolicLink2;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "target");
        C6562gT0.p(xa0, "onError");
        C6562gT0.p(xa02, "copyAction");
        LinkOption[] a2 = C11090z01.a.a(z);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a2, a2.length);
        exists = Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (exists) {
            boolean z3 = false;
            exists2 = Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
            if (exists2) {
                if (!z) {
                    isSymbolicLink2 = Files.isSymbolicLink(path);
                }
                exists3 = Files.exists(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
                if (exists3) {
                    isSymbolicLink = Files.isSymbolicLink(path2);
                    if (!isSymbolicLink) {
                        z2 = true;
                        if (z2) {
                            isSameFile = Files.isSameFile(path, path2);
                        }
                        fileSystem = path.getFileSystem();
                        fileSystem2 = path2.getFileSystem();
                        if (C6562gT0.g(fileSystem, fileSystem2)) {
                            if (z2) {
                                realPath3 = path2.toRealPath(new LinkOption[0]);
                                realPath4 = path.toRealPath(new LinkOption[0]);
                                z3 = realPath3.startsWith(realPath4);
                            } else {
                                parent = path2.getParent();
                                if (parent != null) {
                                    exists4 = Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
                                    if (exists4) {
                                        realPath = parent.toRealPath(new LinkOption[0]);
                                        realPath2 = path.toRealPath(new LinkOption[0]);
                                        startsWith = realPath.startsWith(realPath2);
                                        if (startsWith) {
                                            z3 = true;
                                        }
                                    }
                                }
                            }
                        }
                        if (z3) {
                            C2830Ef0.a();
                            throw C5993eB1.a(path.toString(), path2.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                        }
                    }
                }
                z2 = false;
                if (z2) {
                }
                fileSystem = path.getFileSystem();
                fileSystem2 = path2.getFileSystem();
                if (C6562gT0.g(fileSystem, fileSystem2)) {
                }
                if (z3) {
                }
            }
            normalize = path2.normalize();
            final ArrayList arrayList = new ArrayList();
            C5997eC1.O1(path, 0, z, new HA0() { // from class: o.qB1
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    C7458kA2 a0;
                    a0 = C9673tB1.a0(arrayList, xa02, path, path2, normalize, xa0, (InterfaceC4058Qq0) obj);
                    return a0;
                }
            }, 1, null);
            return path2;
        }
        C6236fB1.a();
        throw C5751dB1.a(path.toString(), path2.toString(), "The source file doesn't exist.");
    }

    @InterfaceC4611Wi0
    @InterfaceC6480g82(version = "1.8")
    @NotNull
    public static final Path S(@NotNull Path path, @NotNull Path path2, @NotNull XA0<? super Path, ? super Path, ? super Exception, ? extends EnumC4756Xu1> xa0, final boolean z, boolean z2) {
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "target");
        C6562gT0.p(xa0, "onError");
        if (z2) {
            return R(path, path2, xa0, z, new XA0() { // from class: o.pB1
                @Override // o.XA0
                public final Object P(Object obj, Object obj2, Object obj3) {
                    LP Y;
                    Y = C9673tB1.Y(z, (KP) obj, (Path) obj2, (Path) obj3);
                    return Y;
                }
            });
        }
        return U(path, path2, xa0, z, null, 8, null);
    }

    public static final FileVisitResult T(ArrayList<Path> arrayList, XA0<? super KP, ? super Path, ? super Path, ? extends LP> xa0, Path path, Path path2, Path path3, XA0<? super Path, ? super Path, ? super Exception, ? extends EnumC4756Xu1> xa02, Path path4, BasicFileAttributes basicFileAttributes) {
        try {
            if (!arrayList.isEmpty()) {
                O(path4);
                Object s3 = C10662xF.s3(arrayList);
                C6562gT0.o(s3, "last(...)");
                P(path4, N30.a(s3));
            }
            return k0(xa0.P(C10734xY.a, path4, W(path, path2, path3, path4)));
        } catch (Exception e2) {
            return X(xa02, path, path2, path3, path4, e2);
        }
    }

    public static /* synthetic */ Path U(Path path, Path path2, XA0 xa0, final boolean z, XA0 xa02, int i, Object obj) {
        if ((i & 2) != 0) {
            xa0 = c.X;
        }
        if ((i & 8) != 0) {
            xa02 = new XA0() { // from class: o.oB1
                @Override // o.XA0
                public final Object P(Object obj2, Object obj3, Object obj4) {
                    LP Z;
                    Z = C9673tB1.Z(z, (KP) obj2, (Path) obj3, (Path) obj4);
                    return Z;
                }
            };
        }
        return R(path, path2, xa0, z, xa02);
    }

    public static /* synthetic */ Path V(Path path, Path path2, XA0 xa0, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            xa0 = b.X;
        }
        return S(path, path2, xa0, z, z2);
    }

    public static final Path W(Path path, Path path2, Path path3, Path path4) {
        Path resolve;
        Path normalize;
        boolean startsWith;
        resolve = path2.resolve(C5997eC1.C1(path4, path).toString());
        normalize = resolve.normalize();
        startsWith = normalize.startsWith(path3);
        if (startsWith) {
            C6562gT0.m(resolve);
            return resolve;
        }
        throw new C6279fM0(path4, resolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
    }

    public static final FileVisitResult X(XA0<? super Path, ? super Path, ? super Exception, ? extends EnumC4756Xu1> xa0, Path path, Path path2, Path path3, Path path4, Exception exc) {
        return l0(xa0.P(path4, W(path, path2, path3, path4), exc));
    }

    public static final LP Y(boolean z, KP kp, Path path, Path path2) {
        LinkOption linkOption;
        boolean isDirectory;
        boolean isDirectory2;
        StandardCopyOption standardCopyOption;
        Path copy;
        C6562gT0.p(kp, "$this$copyToRecursively");
        C6562gT0.p(path, "src");
        C6562gT0.p(path2, "dst");
        LinkOption[] a2 = C11090z01.a.a(z);
        linkOption = LinkOption.NOFOLLOW_LINKS;
        isDirectory = Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a2, a2.length);
        isDirectory2 = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (!isDirectory2 || !isDirectory) {
            if (isDirectory) {
                d0(path2);
            }
            C5607cb2 c5607cb2 = new C5607cb2(2);
            c5607cb2.b(a2);
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            c5607cb2.a(standardCopyOption);
            CopyOption[] copyOptionArr = (CopyOption[]) c5607cb2.d(new CopyOption[c5607cb2.c()]);
            copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
            C6562gT0.o(copy, "copy(...)");
        }
        return LP.X;
    }

    public static final LP Z(boolean z, KP kp, Path path, Path path2) {
        C6562gT0.p(kp, "<this>");
        C6562gT0.p(path, "src");
        C6562gT0.p(path2, "dst");
        return kp.a(path, path2, z);
    }

    public static final C7458kA2 a0(final ArrayList arrayList, final XA0 xa0, final Path path, final Path path2, final Path path3, final XA0 xa02, InterfaceC4058Qq0 interfaceC4058Qq0) {
        C6562gT0.p(interfaceC4058Qq0, "$this$visitFileTree");
        interfaceC4058Qq0.d(new VA0() { // from class: o.rB1
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                FileVisitResult b0;
                b0 = C9673tB1.b0(arrayList, xa0, path, path2, path3, xa02, (Path) obj, (BasicFileAttributes) obj2);
                return b0;
            }
        });
        interfaceC4058Qq0.b(new d(arrayList, xa0, path, path2, path3, xa02));
        interfaceC4058Qq0.c(new e(xa02, path, path2, path3));
        interfaceC4058Qq0.a(new VA0() { // from class: o.sB1
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                FileVisitResult c0;
                c0 = C9673tB1.c0(arrayList, xa02, path, path2, path3, (Path) obj, (IOException) obj2);
                return c0;
            }
        });
        return C7458kA2.a;
    }

    public static final FileVisitResult b0(ArrayList arrayList, XA0 xa0, Path path, Path path2, Path path3, XA0 xa02, Path path4, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        C6562gT0.p(path4, "directory");
        C6562gT0.p(basicFileAttributes, "attributes");
        FileVisitResult T = T(arrayList, xa0, path, path2, path3, xa02, path4, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        if (T == fileVisitResult) {
            arrayList.add(path4);
        }
        return T;
    }

    public static final FileVisitResult c0(ArrayList arrayList, XA0 xa0, Path path, Path path2, Path path3, Path path4, IOException iOException) {
        FileVisitResult fileVisitResult;
        C6562gT0.p(path4, "directory");
        C9444sF.O0(arrayList);
        if (iOException == null) {
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        }
        return X(xa0, path, path2, path3, path4, iOException);
    }

    @InterfaceC4611Wi0
    @InterfaceC6480g82(version = "1.8")
    public static final void d0(@NotNull Path path) {
        C6562gT0.p(path, "<this>");
        List<Exception> e0 = e0(path);
        if (!e0.isEmpty()) {
            FileSystemException a2 = C2732Df0.a("Failed to delete one or more files. See suppressed exceptions for details.");
            for (Exception exc : e0) {
                C3917Pf0.a(a2, exc);
            }
            throw a2;
        }
    }

    public static final List<Exception> e0(Path path) {
        Path parent;
        DirectoryStream directoryStream;
        Path fileName;
        boolean z = false;
        boolean z2 = true;
        C2939Ff0 c2939Ff0 = new C2939Ff0(0, 1, null);
        parent = path.getParent();
        if (parent != null) {
            try {
                directoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                try {
                    DirectoryStream a2 = C6734hB1.a(directoryStream);
                    if (C6977iB1.a(a2)) {
                        c2939Ff0.g(parent);
                        SecureDirectoryStream a3 = C7218jB1.a(a2);
                        fileName = path.getFileName();
                        C6562gT0.o(fileName, "getFileName(...)");
                        g0(a3, fileName, null, c2939Ff0);
                    } else {
                        z = true;
                    }
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    C5033aE.a(directoryStream, null);
                    z2 = z;
                } finally {
                }
            }
        }
        if (z2) {
            i0(path, null, c2939Ff0);
        }
        return c2939Ff0.d();
    }

    public static final void f0(SecureDirectoryStream<Path> secureDirectoryStream, Path path, C2939Ff0 c2939Ff0) {
        SecureDirectoryStream secureDirectoryStream2;
        Iterator it;
        Path fileName;
        LinkOption linkOption;
        try {
            try {
                linkOption = LinkOption.NOFOLLOW_LINKS;
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, linkOption);
            } catch (NoSuchFileException unused) {
                secureDirectoryStream2 = null;
            }
            if (secureDirectoryStream2 != null) {
                SecureDirectoryStream a2 = C7218jB1.a(secureDirectoryStream2);
                it = a2.iterator();
                C6562gT0.o(it, "iterator(...)");
                while (it.hasNext()) {
                    fileName = N30.a(it.next()).getFileName();
                    C6562gT0.o(fileName, "getFileName(...)");
                    g0(a2, fileName, c2939Ff0.e(), c2939Ff0);
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
                C5033aE.a(secureDirectoryStream2, null);
            }
        } catch (Exception e2) {
            c2939Ff0.a(e2);
        }
    }

    public static final void g0(SecureDirectoryStream<Path> secureDirectoryStream, Path path, Path path2, C2939Ff0 c2939Ff0) {
        LinkOption linkOption;
        c2939Ff0.b(path);
        if (path2 != null) {
            try {
                Path e2 = c2939Ff0.e();
                C6562gT0.m(e2);
                O(e2);
                P(e2, path2);
            } catch (Exception e3) {
                c2939Ff0.a(e3);
            }
        }
        linkOption = LinkOption.NOFOLLOW_LINKS;
        if (!j0(secureDirectoryStream, path, linkOption)) {
            secureDirectoryStream.deleteFile(path);
            C7458kA2 c7458kA2 = C7458kA2.a;
        } else {
            int f = c2939Ff0.f();
            f0(secureDirectoryStream, path, c2939Ff0);
            if (f == c2939Ff0.f()) {
                secureDirectoryStream.deleteDirectory(path);
                C7458kA2 c7458kA22 = C7458kA2.a;
            }
            c2939Ff0.c(path);
        }
        c2939Ff0.c(path);
    }

    public static final void h0(Path path, C2939Ff0 c2939Ff0) {
        DirectoryStream directoryStream;
        Iterator it;
        try {
            try {
                directoryStream = Files.newDirectoryStream(path);
            } catch (Exception e2) {
                c2939Ff0.a(e2);
                return;
            }
        } catch (NoSuchFileException unused) {
            directoryStream = null;
        }
        if (directoryStream != null) {
            it = C6734hB1.a(directoryStream).iterator();
            C6562gT0.o(it, "iterator(...)");
            while (it.hasNext()) {
                Path a2 = N30.a(it.next());
                C6562gT0.m(a2);
                i0(a2, path, c2939Ff0);
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            C5033aE.a(directoryStream, null);
        }
    }

    public static final void i0(Path path, Path path2, C2939Ff0 c2939Ff0) {
        LinkOption linkOption;
        boolean isDirectory;
        if (path2 != null) {
            try {
                O(path);
                P(path, path2);
            } catch (Exception e2) {
                c2939Ff0.a(e2);
                return;
            }
        }
        linkOption = LinkOption.NOFOLLOW_LINKS;
        isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
        if (!isDirectory) {
            Files.deleteIfExists(path);
            return;
        }
        int f = c2939Ff0.f();
        h0(path, c2939Ff0);
        if (f == c2939Ff0.f()) {
            Files.deleteIfExists(path);
        }
    }

    public static final boolean j0(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        FileAttributeView fileAttributeView;
        BasicFileAttributes readAttributes;
        boolean isDirectory;
        try {
            fileAttributeView = secureDirectoryStream.getFileAttributeView(path, TA1.a(), (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
            readAttributes = VA1.a(fileAttributeView).readAttributes();
            isDirectory = readAttributes.isDirectory();
            bool = Boolean.valueOf(isDirectory);
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @InterfaceC4611Wi0
    public static final FileVisitResult k0(LP lp) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        int i = a.a[lp.ordinal()];
        if (i == 1) {
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        } else if (i == 2) {
            fileVisitResult2 = FileVisitResult.TERMINATE;
            return fileVisitResult2;
        } else if (i == 3) {
            fileVisitResult3 = FileVisitResult.SKIP_SUBTREE;
            return fileVisitResult3;
        } else {
            throw new C3865Oq1();
        }
    }

    @InterfaceC4611Wi0
    public static final FileVisitResult l0(EnumC4756Xu1 enumC4756Xu1) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        int i = a.b[enumC4756Xu1.ordinal()];
        if (i == 1) {
            fileVisitResult = FileVisitResult.TERMINATE;
            return fileVisitResult;
        } else if (i == 2) {
            fileVisitResult2 = FileVisitResult.SKIP_SUBTREE;
            return fileVisitResult2;
        } else {
            throw new C3865Oq1();
        }
    }

    public static final <R> R m0(FA0<? extends R> fa0) {
        try {
            return fa0.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}
