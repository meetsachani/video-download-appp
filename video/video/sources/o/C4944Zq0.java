package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.Zq0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4944Zq0 {
    public static final int a = 10000;
    public static final InterfaceC5631ch2<File> b = new b();

    /* renamed from: o.Zq0$a */
    /* loaded from: classes3.dex */
    public class a implements WZ0<List<String>> {
        public final List<String> a = C10608x11.q();

        @Override // o.WZ0
        public boolean a(String str) {
            this.a.add(str);
            return true;
        }

        @Override // o.WZ0
        /* renamed from: b */
        public List<String> getResult() {
            return this.a;
        }
    }

    /* renamed from: o.Zq0$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC5631ch2<File> {
        @Override // o.InterfaceC5631ch2, o.DE0
        /* renamed from: N */
        public Iterable<File> b(File file) {
            File[] listFiles;
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                return Collections.unmodifiableList(Arrays.asList(listFiles));
            }
            return AbstractC5317bO0.L();
        }
    }

    /* renamed from: o.Zq0$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC7382js {
        public final File a;
        public final AbstractC9481sO0<EnumC4546Vq0> b;

        public /* synthetic */ c(File file, EnumC4546Vq0[] enumC4546Vq0Arr, a aVar) {
            this(file, enumC4546Vq0Arr);
        }

        @Override // o.AbstractC7382js
        /* renamed from: f */
        public FileOutputStream c() throws IOException {
            return new FileOutputStream(this.a, this.b.contains(EnumC4546Vq0.APPEND));
        }

        public String toString() {
            String valueOf = String.valueOf(this.a);
            String valueOf2 = String.valueOf(this.b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20 + valueOf2.length());
            sb.append("Files.asByteSink(");
            sb.append(valueOf);
            sb.append(C6566gU0.h);
            sb.append(valueOf2);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public c(File file, EnumC4546Vq0... enumC4546Vq0Arr) {
            this.a = (File) C10664xF1.E(file);
            this.b = AbstractC9481sO0.J(enumC4546Vq0Arr);
        }
    }

    /* renamed from: o.Zq0$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC7625ks {
        public final File a;

        public /* synthetic */ d(File file, a aVar) {
            this(file);
        }

        @Override // o.AbstractC7625ks
        public byte[] o() throws IOException {
            try {
                FileInputStream fileInputStream = (FileInputStream) C8218nE.a().d(m());
                return C8129ms.v(fileInputStream, fileInputStream.getChannel().size());
            } finally {
            }
        }

        @Override // o.AbstractC7625ks
        public long p() throws IOException {
            if (this.a.isFile()) {
                return this.a.length();
            }
            throw new FileNotFoundException(this.a.toString());
        }

        @Override // o.AbstractC7625ks
        public AbstractC4468Uv1<Long> q() {
            if (this.a.isFile()) {
                return AbstractC4468Uv1.f(Long.valueOf(this.a.length()));
            }
            return AbstractC4468Uv1.a();
        }

        @Override // o.AbstractC7625ks
        /* renamed from: t */
        public FileInputStream m() throws IOException {
            return new FileInputStream(this.a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Files.asByteSource(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public d(File file) {
            this.a = (File) C10664xF1.E(file);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.Zq0$e */
    /* loaded from: classes3.dex */
    public static abstract class e implements IF1<File> {
        public static final e X = new a("IS_DIRECTORY", 0);
        public static final e Y = new b("IS_FILE", 1);
        public static final /* synthetic */ e[] Z = e();

        /* renamed from: o.Zq0$e$a */
        /* loaded from: classes3.dex */
        public enum a extends e {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // o.IF1
            /* renamed from: g */
            public boolean apply(File file) {
                return file.isDirectory();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isDirectory()";
            }
        }

        /* renamed from: o.Zq0$e$b */
        /* loaded from: classes3.dex */
        public enum b extends e {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // o.IF1
            /* renamed from: g */
            public boolean apply(File file) {
                return file.isFile();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Files.isFile()";
            }
        }

        public e(String str, int i) {
        }

        public static /* synthetic */ e[] e() {
            return new e[]{X, Y};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) Z.clone();
        }

        public /* synthetic */ e(String str, int i, a aVar) {
            this(str, i);
        }
    }

    @InterfaceC6181ey
    @InterfaceC9377ry1
    @Deprecated
    @VP0(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readLines(callback)")
    public static <T> T A(File file, Charset charset, WZ0<T> wz0) throws IOException {
        return (T) e(file, charset).p(wz0);
    }

    public static List<String> B(File file, Charset charset) throws IOException {
        return (List) e(file, charset).p(new a());
    }

    public static String C(String str) {
        String str2;
        C10664xF1.E(str);
        if (str.length() == 0) {
            return UE.h;
        }
        Iterable<String> n = C5365bb2.h('/').g().n(str);
        ArrayList arrayList = new ArrayList();
        for (String str3 : n) {
            str3.getClass();
            if (!str3.equals(UE.h)) {
                if (!str3.equals("..")) {
                    arrayList.add(str3);
                } else if (arrayList.size() > 0 && !((String) arrayList.get(arrayList.size() - 1)).equals("..")) {
                    arrayList.remove(arrayList.size() - 1);
                } else {
                    arrayList.add("..");
                }
            }
        }
        String k = C7782lV0.o('/').k(arrayList);
        if (str.charAt(0) == '/') {
            String valueOf = String.valueOf(k);
            if (valueOf.length() != 0) {
                str2 = RemoteSettings.i.concat(valueOf);
            } else {
                str2 = new String(RemoteSettings.i);
            }
            k = str2;
        }
        while (k.startsWith("/../")) {
            k = k.substring(3);
        }
        if (k.equals("/..")) {
            return RemoteSettings.i;
        }
        if ("".equals(k)) {
            return UE.h;
        }
        return k;
    }

    public static byte[] D(File file) throws IOException {
        return c(file).o();
    }

    @Deprecated
    @VP0(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).read()")
    public static String E(File file, Charset charset) throws IOException {
        return e(file, charset).n();
    }

    public static void F(File file) throws IOException {
        C10664xF1.E(file);
        if (!file.createNewFile() && !file.setLastModified(System.currentTimeMillis())) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(valueOf.length() + 38);
            sb.append("Unable to update modification time of ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }

    @Deprecated
    @VP0(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset).write(from)")
    public static void G(CharSequence charSequence, File file, Charset charset) throws IOException {
        d(file, charset, new EnumC4546Vq0[0]).c(charSequence);
    }

    public static void H(byte[] bArr, File file) throws IOException {
        b(file, new EnumC4546Vq0[0]).d(bArr);
    }

    @Deprecated
    @VP0(imports = {"com.google.common.io.FileWriteMode", "com.google.common.io.Files"}, replacement = "Files.asCharSink(to, charset, FileWriteMode.APPEND).write(from)")
    public static void a(CharSequence charSequence, File file, Charset charset) throws IOException {
        d(file, charset, EnumC4546Vq0.APPEND).c(charSequence);
    }

    public static AbstractC7382js b(File file, EnumC4546Vq0... enumC4546Vq0Arr) {
        return new c(file, enumC4546Vq0Arr, null);
    }

    public static AbstractC7625ks c(File file) {
        return new d(file, null);
    }

    public static AbstractC7216jB d(File file, Charset charset, EnumC4546Vq0... enumC4546Vq0Arr) {
        return b(file, enumC4546Vq0Arr).a(charset);
    }

    public static AbstractC7459kB e(File file, Charset charset) {
        return c(file).a(charset);
    }

    public static void f(File file, File file2) throws IOException {
        C10664xF1.y(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        c(file).g(b(file2, new EnumC4546Vq0[0]));
    }

    public static void g(File file, OutputStream outputStream) throws IOException {
        c(file).f(outputStream);
    }

    @Deprecated
    @VP0(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(from, charset).copyTo(to)")
    public static void h(File file, Charset charset, Appendable appendable) throws IOException {
        e(file, charset).e(appendable);
    }

    public static void i(File file) throws IOException {
        C10664xF1.E(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(valueOf.length() + 39);
            sb.append("Unable to create parent directories of ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }

    @InterfaceC4238Sm
    @Deprecated
    public static File j() {
        File file = new File(System.getProperty(C3451Kk2.e));
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(21);
        sb.append(currentTimeMillis);
        sb.append("-");
        String sb2 = sb.toString();
        for (int i = 0; i < 10000; i++) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 11);
            sb3.append(sb2);
            sb3.append(i);
            File file2 = new File(file, sb3.toString());
            if (file2.mkdir()) {
                return file2;
            }
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 66 + String.valueOf(sb2).length());
        sb4.append("Failed to create directory within 10000 attempts (tried ");
        sb4.append(sb2);
        sb4.append("0 to ");
        sb4.append(sb2);
        sb4.append(9999);
        sb4.append(')');
        throw new IllegalStateException(sb4.toString());
    }

    public static boolean k(File file, File file2) throws IOException {
        C10664xF1.E(file);
        C10664xF1.E(file2);
        if (file != file2 && !file.equals(file2)) {
            long length = file.length();
            long length2 = file2.length();
            if (length != 0 && length2 != 0 && length != length2) {
                return false;
            }
            return c(file).e(c(file2));
        }
        return true;
    }

    @InterfaceC4238Sm
    public static Yt2<File> l() {
        return Yt2.h(b);
    }

    public static String m(String str) {
        C10664xF1.E(str);
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "";
        }
        return name.substring(lastIndexOf + 1);
    }

    public static String n(String str) {
        C10664xF1.E(str);
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return name;
        }
        return name.substring(0, lastIndexOf);
    }

    @Deprecated
    @VP0(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).hash(hashFunction)")
    public static AbstractC8471oG0 o(File file, InterfaceC9449sG0 interfaceC9449sG0) throws IOException {
        return c(file).j(interfaceC9449sG0);
    }

    public static IF1<File> p() {
        return e.X;
    }

    public static IF1<File> q() {
        return e.Y;
    }

    public static MappedByteBuffer r(File file) throws IOException {
        C10664xF1.E(file);
        return s(file, FileChannel.MapMode.READ_ONLY);
    }

    public static MappedByteBuffer s(File file, FileChannel.MapMode mapMode) throws IOException {
        return u(file, mapMode, -1L);
    }

    public static MappedByteBuffer t(File file, FileChannel.MapMode mapMode, long j) throws IOException {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "size (%s) may not be negative", j);
        return u(file, mapMode, j);
    }

    public static MappedByteBuffer u(File file, FileChannel.MapMode mapMode, long j) throws IOException {
        String str;
        C10664xF1.E(file);
        C10664xF1.E(mapMode);
        C8218nE a2 = C8218nE.a();
        try {
            if (mapMode == FileChannel.MapMode.READ_ONLY) {
                str = "r";
            } else {
                str = FN1.c1;
            }
            FileChannel fileChannel = (FileChannel) a2.d(((RandomAccessFile) a2.d(new RandomAccessFile(file, str))).getChannel());
            if (j == -1) {
                j = fileChannel.size();
            }
            return fileChannel.map(mapMode, 0L, j);
        } finally {
        }
    }

    public static void v(File file, File file2) throws IOException {
        C10664xF1.E(file);
        C10664xF1.E(file2);
        C10664xF1.y(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (!file.renameTo(file2)) {
            f(file, file2);
            if (!file.delete()) {
                if (!file2.delete()) {
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 17);
                    sb.append("Unable to delete ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
                String valueOf2 = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 17);
                sb2.append("Unable to delete ");
                sb2.append(valueOf2);
                throw new IOException(sb2.toString());
            }
        }
    }

    public static BufferedReader w(File file, Charset charset) throws FileNotFoundException {
        C10664xF1.E(file);
        C10664xF1.E(charset);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    public static BufferedWriter x(File file, Charset charset) throws FileNotFoundException {
        C10664xF1.E(file);
        C10664xF1.E(charset);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    @InterfaceC6181ey
    @InterfaceC9377ry1
    @Deprecated
    @VP0(imports = {"com.google.common.io.Files"}, replacement = "Files.asByteSource(file).read(processor)")
    public static <T> T y(File file, InterfaceC7140is<T> interfaceC7140is) throws IOException {
        return (T) c(file).n(interfaceC7140is);
    }

    @MB
    @Deprecated
    @VP0(imports = {"com.google.common.io.Files"}, replacement = "Files.asCharSource(file, charset).readFirstLine()")
    public static String z(File file, Charset charset) throws IOException {
        return e(file, charset).o();
    }
}
