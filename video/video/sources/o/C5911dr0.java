package o;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
/* renamed from: o.dr0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5911dr0 extends C5427br0 {
    public static /* synthetic */ List A(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        return z(file, charset);
    }

    public static final C7458kA2 B(ArrayList arrayList, String str) {
        C6562gT0.p(str, "it");
        arrayList.add(str);
        return C7458kA2.a;
    }

    @NotNull
    public static final String C(@NotNull File file, @NotNull Charset charset) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String m = C4532Vm2.m(inputStreamReader);
            C5033aE.a(inputStreamReader, null);
            return m;
        } finally {
        }
    }

    public static /* synthetic */ String D(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        return C(file, charset);
    }

    @XP0
    public static final InputStreamReader E(File file, Charset charset) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static /* synthetic */ InputStreamReader F(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T G(@NotNull File file, @NotNull Charset charset, @NotNull HA0<? super B02<String>, ? extends T> ha0) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(ha0, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            T invoke = ha0.invoke(C4532Vm2.i(bufferedReader));
            UP0.d(1);
            C5033aE.a(bufferedReader, null);
            UP0.c(1);
            return invoke;
        } finally {
        }
    }

    public static /* synthetic */ Object H(File file, Charset charset, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(ha0, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            Object invoke = ha0.invoke(C4532Vm2.i(bufferedReader));
            UP0.d(1);
            C5033aE.a(bufferedReader, null);
            UP0.c(1);
            return invoke;
        } finally {
        }
    }

    public static final void I(@NotNull File file, @NotNull byte[] bArr) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            C7458kA2 c7458kA2 = C7458kA2.a;
            C5033aE.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void J(@NotNull File file, @NotNull String str, @NotNull Charset charset) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(str, "text");
        C6562gT0.p(charset, C4317Th1.g);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            L(fileOutputStream, str, charset);
            C7458kA2 c7458kA2 = C7458kA2.a;
            C5033aE.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void K(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = HB.b;
        }
        J(file, str, charset);
    }

    public static void L(@NotNull OutputStream outputStream, @NotNull String str, @NotNull Charset charset) {
        boolean z;
        C6562gT0.p(outputStream, "<this>");
        C6562gT0.p(str, "text");
        C6562gT0.p(charset, C4317Th1.g);
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            C6562gT0.o(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder u = u(charset);
        CharBuffer allocate = CharBuffer.allocate(8192);
        C6562gT0.m(u);
        ByteBuffer o2 = o(8192, u);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i2, str.length() - i);
            int i3 = i + min;
            char[] array = allocate.array();
            C6562gT0.o(array, "array(...)");
            str.getChars(i, i3, array, i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (i3 == str.length()) {
                z = true;
            } else {
                z = false;
            }
            if (u.encode(allocate, o2, z).isUnderflow()) {
                outputStream.write(o2.array(), 0, o2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i2 = 0;
                }
                allocate.clear();
                o2.clear();
                i = i3;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    @XP0
    public static final OutputStreamWriter M(File file, Charset charset) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static /* synthetic */ OutputStreamWriter N(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void h(@NotNull File file, @NotNull byte[] bArr) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bArr);
            C7458kA2 c7458kA2 = C7458kA2.a;
            C5033aE.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void i(@NotNull File file, @NotNull String str, @NotNull Charset charset) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(str, "text");
        C6562gT0.p(charset, C4317Th1.g);
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            L(fileOutputStream, str, charset);
            C7458kA2 c7458kA2 = C7458kA2.a;
            C5033aE.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void j(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = HB.b;
        }
        i(file, str, charset);
    }

    @XP0
    public static final BufferedReader k(File file, Charset charset, int i) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i);
    }

    public static /* synthetic */ BufferedReader l(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = HB.b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i);
    }

    @XP0
    public static final BufferedWriter m(File file, Charset charset, int i) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i);
    }

    public static /* synthetic */ BufferedWriter n(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = HB.b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i);
    }

    @NotNull
    public static ByteBuffer o(int i, @NotNull CharsetEncoder charsetEncoder) {
        C6562gT0.p(charsetEncoder, "encoder");
        ByteBuffer allocate = ByteBuffer.allocate(i * ((int) Math.ceil(charsetEncoder.maxBytesPerChar())));
        C6562gT0.o(allocate, "allocate(...)");
        return allocate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void p(@NotNull File file, int i, @NotNull VA0<? super byte[], ? super Integer, C7458kA2> va0) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(va0, "action");
        ?? r2 = new byte[C5075aO1.u(i, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(r2);
                if (read <= 0) {
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    C5033aE.a(fileInputStream, null);
                    return;
                }
                va0.i(r2, Integer.valueOf(read));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C5033aE.a(fileInputStream, th);
                    throw th2;
                }
            }
        }
    }

    public static final void q(@NotNull File file, @NotNull VA0<? super byte[], ? super Integer, C7458kA2> va0) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(va0, "action");
        p(file, 4096, va0);
    }

    public static final void r(@NotNull File file, @NotNull Charset charset, @NotNull HA0<? super String, C7458kA2> ha0) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(ha0, "action");
        C4532Vm2.h(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), ha0);
    }

    public static /* synthetic */ void s(File file, Charset charset, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        r(file, charset, ha0);
    }

    @XP0
    public static final FileInputStream t(File file) {
        C6562gT0.p(file, "<this>");
        return new FileInputStream(file);
    }

    public static CharsetEncoder u(@NotNull Charset charset) {
        C6562gT0.p(charset, "<this>");
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @XP0
    public static final FileOutputStream v(File file) {
        C6562gT0.p(file, "<this>");
        return new FileOutputStream(file);
    }

    @XP0
    public static final PrintWriter w(File file, Charset charset) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    public static /* synthetic */ PrintWriter x(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    @NotNull
    public static final byte[] y(@NotNull File file) {
        C6562gT0.p(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                    C6562gT0.o(bArr, "copyOf(...)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        C8581oj0 c8581oj0 = new C8581oj0(8193);
                        c8581oj0.write(read2);
                        C8372ns.l(fileInputStream, c8581oj0, 0, 2, null);
                        int size = c8581oj0.size() + i;
                        if (size >= 0) {
                            byte[] a = c8581oj0.a();
                            byte[] copyOf = Arrays.copyOf(bArr, size);
                            C6562gT0.o(copyOf, "copyOf(...)");
                            bArr = C4788Ye.v0(a, copyOf, i, 0, c8581oj0.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                C5033aE.a(fileInputStream, null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5033aE.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    @NotNull
    public static final List<String> z(@NotNull File file, @NotNull Charset charset) {
        C6562gT0.p(file, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        final ArrayList arrayList = new ArrayList();
        r(file, charset, new HA0() { // from class: o.cr0
            @Override // o.HA0
            public final Object invoke(Object obj) {
                C7458kA2 B;
                B = C5911dr0.B(arrayList, (String) obj);
                return B;
            }
        });
        return arrayList;
    }
}
