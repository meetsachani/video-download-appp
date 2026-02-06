package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1292#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
/* renamed from: o.gr0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6652gr0 extends C6154er0 {

    /* renamed from: o.gr0$a */
    /* loaded from: classes3.dex */
    public static final class a implements VA0 {
        public static final a X = new a();

        @Override // o.VA0
        /* renamed from: c */
        public final Void i(File file, IOException iOException) {
            C6562gT0.p(file, "<unused var>");
            C6562gT0.p(iOException, "exception");
            throw iOException;
        }
    }

    public static final boolean T(@NotNull File file, @NotNull File file2, boolean z, @NotNull final VA0<? super File, ? super IOException, ? extends EnumC4659Wu1> va0) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(file2, "target");
        C6562gT0.p(va0, "onError");
        if (!file.exists()) {
            if (va0.i(file, new C3669Mq1(file, null, "The source file doesn't exist.", 2, null)) != EnumC4659Wu1.Y) {
                return true;
            }
            return false;
        }
        try {
            Iterator<File> it = C6154er0.R(file).k(new VA0() { // from class: o.fr0
                @Override // o.VA0
                public final Object i(Object obj, Object obj2) {
                    C7458kA2 V;
                    V = C6652gr0.V(VA0.this, (File) obj, (IOException) obj2);
                    return V;
                }
            }).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (!next.exists()) {
                    if (va0.i(next, new C3669Mq1(next, null, "The source file doesn't exist.", 2, null)) == EnumC4659Wu1.Y) {
                        return false;
                    }
                } else {
                    File file3 = new File(file2, u0(next, file));
                    if (file3.exists() && (!next.isDirectory() || !file3.isDirectory())) {
                        if (z) {
                            if (file3.isDirectory()) {
                                if (!c0(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (va0.i(file3, new C2572Bo0(next, file3, "The destination file already exists.")) == EnumC4659Wu1.Y) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        boolean z2 = z;
                        if (X(next, file3, z2, 0, 4, null).length() != next.length() && va0.i(next, new IOException("Source file wasn't copied completely, length of destination file differs.")) == EnumC4659Wu1.Y) {
                            return false;
                        }
                        z = z2;
                    }
                }
            }
            return true;
        } catch (C7604km2 unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean U(File file, File file2, boolean z, VA0 va0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            va0 = a.X;
        }
        return T(file, file2, z, va0);
    }

    public static final C7458kA2 V(VA0 va0, File file, IOException iOException) {
        C6562gT0.p(file, "f");
        C6562gT0.p(iOException, W12.i);
        if (va0.i(file, iOException) != EnumC4659Wu1.Y) {
            return C7458kA2.a;
        }
        throw new C7604km2(file);
    }

    @NotNull
    public static final File W(@NotNull File file, @NotNull File file2, boolean z, int i) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(file2, "target");
        if (file.exists()) {
            if (file2.exists()) {
                if (z) {
                    if (!file2.delete()) {
                        throw new C2572Bo0(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                    }
                } else {
                    throw new C2572Bo0(file, file2, "The destination file already exists.");
                }
            }
            if (file.isDirectory()) {
                if (file2.mkdirs()) {
                    return file2;
                }
                throw new C2772Dp0(file, file2, "Failed to create target directory.");
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                C8372ns.k(fileInputStream, fileOutputStream, i);
                C5033aE.a(fileOutputStream, null);
                C5033aE.a(fileInputStream, null);
                return file2;
            } finally {
            }
        } else {
            throw new C3669Mq1(file, null, "The source file doesn't exist.", 2, null);
        }
    }

    public static /* synthetic */ File X(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return W(file, file2, z, i);
    }

    @InterfaceC9150r20(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @NotNull
    public static final File Y(@NotNull String str, @Nullable String str2, @Nullable File file) {
        C6562gT0.p(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            C6562gT0.m(createTempFile);
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + '.');
    }

    public static /* synthetic */ File Z(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return Y(str, str2, file);
    }

    @InterfaceC9150r20(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @NotNull
    public static final File a0(@NotNull String str, @Nullable String str2, @Nullable File file) {
        C6562gT0.p(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        C6562gT0.o(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    public static /* synthetic */ File b0(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return a0(str, str2, file);
    }

    public static boolean c0(@NotNull File file) {
        C6562gT0.p(file, "<this>");
        while (true) {
            boolean z = true;
            for (File file2 : C6154er0.Q(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static final boolean d0(@NotNull File file, @NotNull File file2) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(file2, "other");
        C9826tp0 f = C5427br0.f(file);
        C9826tp0 f2 = C5427br0.f(file2);
        if (f2.i()) {
            return C6562gT0.g(file, file2);
        }
        int h = f.h() - f2.h();
        if (h < 0) {
            return false;
        }
        return f.g().subList(h, f.h()).equals(f2.g());
    }

    public static final boolean e0(@NotNull File file, @NotNull String str) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(str, "other");
        return d0(file, new File(str));
    }

    @NotNull
    public static String f0(@NotNull File file) {
        C6562gT0.p(file, "<this>");
        String name = file.getName();
        C6562gT0.o(name, "getName(...)");
        return C10763xf2.N5(name, '.', "");
    }

    @NotNull
    public static final String g0(@NotNull File file) {
        C6562gT0.p(file, "<this>");
        char c = File.separatorChar;
        if (c != '/') {
            String path = file.getPath();
            C6562gT0.o(path, "getPath(...)");
            return C9545sf2.y2(path, c, '/', false, 4, null);
        }
        String path2 = file.getPath();
        C6562gT0.o(path2, "getPath(...)");
        return path2;
    }

    @NotNull
    public static final String h0(@NotNull File file) {
        C6562gT0.p(file, "<this>");
        String name = file.getName();
        C6562gT0.o(name, "getName(...)");
        return C10763xf2.Y5(name, UE.h, null, 2, null);
    }

    @NotNull
    public static final File i0(@NotNull File file) {
        C6562gT0.p(file, "<this>");
        C9826tp0 f = C5427br0.f(file);
        File e = f.e();
        String str = File.separator;
        C6562gT0.o(str, "separator");
        return p0(e, C10662xF.p3(j0(f.g()), str, null, null, 0, null, null, 62, null));
    }

    public static final List<File> j0(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!C6562gT0.g(name, UE.h)) {
                if (C6562gT0.g(name, "..")) {
                    if (!arrayList.isEmpty() && !C6562gT0.g(((File) C10662xF.s3(arrayList)).getName(), "..")) {
                        arrayList.remove(arrayList.size() - 1);
                    } else {
                        arrayList.add(file);
                    }
                } else {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public static final C9826tp0 k0(C9826tp0 c9826tp0) {
        return new C9826tp0(c9826tp0.e(), j0(c9826tp0.g()));
    }

    @NotNull
    public static final File l0(@NotNull File file, @NotNull File file2) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(file2, C5445bv2.X);
        return new File(u0(file, file2));
    }

    @Nullable
    public static final File m0(@NotNull File file, @NotNull File file2) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(file2, C5445bv2.X);
        String v0 = v0(file, file2);
        if (v0 != null) {
            return new File(v0);
        }
        return null;
    }

    @NotNull
    public static final File n0(@NotNull File file, @NotNull File file2) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(file2, C5445bv2.X);
        String v0 = v0(file, file2);
        if (v0 != null) {
            return new File(v0);
        }
        return file;
    }

    @NotNull
    public static final File o0(@NotNull File file, @NotNull File file2) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(file2, EK.e);
        if (C5427br0.d(file2)) {
            return file2;
        }
        String file3 = file.toString();
        C6562gT0.o(file3, "toString(...)");
        if (file3.length() != 0) {
            char c = File.separatorChar;
            if (!C10763xf2.s3(file3, c, false, 2, null)) {
                return new File(file3 + c + file2);
            }
        }
        return new File(file3 + file2);
    }

    @NotNull
    public static final File p0(@NotNull File file, @NotNull String str) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(str, EK.e);
        return o0(file, new File(str));
    }

    @NotNull
    public static final File q0(@NotNull File file, @NotNull File file2) {
        File j;
        C6562gT0.p(file, "<this>");
        C6562gT0.p(file2, EK.e);
        C9826tp0 f = C5427br0.f(file);
        if (f.h() == 0) {
            j = new File("..");
        } else {
            j = f.j(0, f.h() - 1);
        }
        return o0(o0(f.e(), j), file2);
    }

    @NotNull
    public static final File r0(@NotNull File file, @NotNull String str) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(str, EK.e);
        return q0(file, new File(str));
    }

    public static final boolean s0(@NotNull File file, @NotNull File file2) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(file2, "other");
        C9826tp0 f = C5427br0.f(file);
        C9826tp0 f2 = C5427br0.f(file2);
        if (!C6562gT0.g(f.e(), f2.e()) || f.h() < f2.h()) {
            return false;
        }
        return f.g().subList(0, f2.h()).equals(f2.g());
    }

    public static final boolean t0(@NotNull File file, @NotNull String str) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(str, "other");
        return s0(file, new File(str));
    }

    @NotNull
    public static final String u0(@NotNull File file, @NotNull File file2) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(file2, C5445bv2.X);
        String v0 = v0(file, file2);
        if (v0 != null) {
            return v0;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    public static final String v0(File file, File file2) {
        C9826tp0 k0 = k0(C5427br0.f(file));
        C9826tp0 k02 = k0(C5427br0.f(file2));
        if (!C6562gT0.g(k0.e(), k02.e())) {
            return null;
        }
        int h = k02.h();
        int h2 = k0.h();
        int min = Math.min(h2, h);
        int i = 0;
        while (i < min && C6562gT0.g(k0.g().get(i), k02.g().get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = h - 1;
        if (i <= i2) {
            while (!C6562gT0.g(k02.g().get(i2).getName(), "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < h2) {
            if (i < h) {
                sb.append(File.separatorChar);
            }
            String str = File.separator;
            C6562gT0.o(str, "separator");
            C10662xF.n3(C10662xF.e2(k0.g(), i), sb, str, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }
}
