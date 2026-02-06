package o;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,346:1\n1#2:347\n1#2:349\n57#3:348\n1321#4,2:350\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n219#1:349\n219#1:348\n219#1:350,2\n*E\n"})
/* loaded from: classes3.dex */
public class NA1 {
    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path A(Path path, B02<? extends CharSequence> b02, Charset charset, OpenOption... openOptionArr) throws IOException {
        Path write;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(b02, "lines");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        write = Files.write(path, C6695h12.j0(b02), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C6562gT0.o(write, "write(...)");
        return write;
    }

    public static /* synthetic */ Path B(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        Path write;
        if ((i & 2) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(iterable, "lines");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C6562gT0.o(write, "write(...)");
        return write;
    }

    public static /* synthetic */ Path C(Path path, B02 b02, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        Path write;
        if ((i & 2) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(b02, "lines");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        write = Files.write(path, C6695h12.j0(b02), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C6562gT0.o(write, "write(...)");
        return write;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final void D(@NotNull Path path, @NotNull CharSequence charSequence, @NotNull Charset charset, @NotNull OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        CharBuffer wrap;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charSequence, "text");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        try {
            if (charSequence instanceof String) {
                C6562gT0.m(newOutputStream);
                C5911dr0.L(newOutputStream, (String) charSequence, charset);
            } else {
                CharsetEncoder u = C5911dr0.u(charset);
                if (charSequence instanceof CharBuffer) {
                    wrap = ((CharBuffer) charSequence).asReadOnlyBuffer();
                } else {
                    wrap = CharBuffer.wrap(charSequence);
                }
                int min = Math.min(charSequence.length(), 8192);
                C6562gT0.m(u);
                ByteBuffer o2 = C5911dr0.o(min, u);
                while (wrap.hasRemaining()) {
                    if (!u.encode(wrap, o2, true).isError()) {
                        newOutputStream.write(o2.array(), 0, o2.position());
                        o2.clear();
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                }
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            C5033aE.a(newOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5033aE.a(newOutputStream, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = HB.b;
        }
        D(path, charSequence, charset, openOptionArr);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final OutputStreamWriter F(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new OutputStreamWriter(newOutputStream, charset);
    }

    public static /* synthetic */ OutputStreamWriter G(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        OutputStream newOutputStream;
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new OutputStreamWriter(newOutputStream, charset);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final void a(Path path, byte[] bArr) throws IOException {
        StandardOpenOption standardOpenOption;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(bArr, "array");
        standardOpenOption = StandardOpenOption.APPEND;
        Files.write(path, bArr, standardOpenOption);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path b(Path path, Iterable<? extends CharSequence> iterable, Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(iterable, "lines");
        C6562gT0.p(charset, C4317Th1.g);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, iterable, charset, standardOpenOption);
        C6562gT0.o(write, "write(...)");
        return write;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path c(Path path, B02<? extends CharSequence> b02, Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(b02, "lines");
        C6562gT0.p(charset, C4317Th1.g);
        Iterable j0 = C6695h12.j0(b02);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, j0, charset, standardOpenOption);
        C6562gT0.o(write, "write(...)");
        return write;
    }

    public static /* synthetic */ Path d(Path path, Iterable iterable, Charset charset, int i, Object obj) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i & 2) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(iterable, "lines");
        C6562gT0.p(charset, C4317Th1.g);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, iterable, charset, standardOpenOption);
        C6562gT0.o(write, "write(...)");
        return write;
    }

    public static /* synthetic */ Path e(Path path, B02 b02, Charset charset, int i, Object obj) throws IOException {
        StandardOpenOption standardOpenOption;
        Path write;
        if ((i & 2) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(b02, "lines");
        C6562gT0.p(charset, C4317Th1.g);
        Iterable j0 = C6695h12.j0(b02);
        standardOpenOption = StandardOpenOption.APPEND;
        write = Files.write(path, j0, charset, standardOpenOption);
        C6562gT0.o(write, "write(...)");
        return write;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final void f(@NotNull Path path, @NotNull CharSequence charSequence, @NotNull Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charSequence, "text");
        C6562gT0.p(charset, C4317Th1.g);
        standardOpenOption = StandardOpenOption.APPEND;
        D(path, charSequence, charset, standardOpenOption);
    }

    public static /* synthetic */ void g(Path path, CharSequence charSequence, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = HB.b;
        }
        f(path, charSequence, charset);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final BufferedReader h(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        InputStream newInputStream;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new BufferedReader(new InputStreamReader(newInputStream, charset), i);
    }

    public static /* synthetic */ BufferedReader i(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        InputStream newInputStream;
        if ((i2 & 1) != 0) {
            charset = HB.b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new BufferedReader(new InputStreamReader(newInputStream, charset), i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final BufferedWriter j(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new BufferedWriter(new OutputStreamWriter(newOutputStream, charset), i);
    }

    public static /* synthetic */ BufferedWriter k(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        OutputStream newOutputStream;
        if ((i2 & 1) != 0) {
            charset = HB.b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new BufferedWriter(new OutputStreamWriter(newOutputStream, charset), i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final void l(Path path, Charset charset, HA0<? super String, C7458kA2> ha0) throws IOException {
        BufferedReader newBufferedReader;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(ha0, "action");
        newBufferedReader = Files.newBufferedReader(path, charset);
        C6562gT0.o(newBufferedReader, "newBufferedReader(...)");
        try {
            for (String str : C4532Vm2.i(newBufferedReader)) {
                ha0.invoke(str);
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            UP0.d(1);
            C5033aE.a(newBufferedReader, null);
            UP0.c(1);
        } finally {
        }
    }

    public static /* synthetic */ void m(Path path, Charset charset, HA0 ha0, int i, Object obj) throws IOException {
        BufferedReader newBufferedReader;
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(ha0, "action");
        newBufferedReader = Files.newBufferedReader(path, charset);
        C6562gT0.o(newBufferedReader, "newBufferedReader(...)");
        try {
            for (String str : C4532Vm2.i(newBufferedReader)) {
                ha0.invoke(str);
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            UP0.d(1);
            C5033aE.a(newBufferedReader, null);
            UP0.c(1);
        } finally {
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final InputStream n(Path path, OpenOption... openOptionArr) throws IOException {
        InputStream newInputStream;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C6562gT0.o(newInputStream, "newInputStream(...)");
        return newInputStream;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final OutputStream o(Path path, OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C6562gT0.o(newOutputStream, "newOutputStream(...)");
        return newOutputStream;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final byte[] p(Path path) throws IOException {
        byte[] readAllBytes;
        C6562gT0.p(path, "<this>");
        readAllBytes = Files.readAllBytes(path);
        C6562gT0.o(readAllBytes, "readAllBytes(...)");
        return readAllBytes;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final List<String> q(Path path, Charset charset) throws IOException {
        List<String> readAllLines;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        readAllLines = Files.readAllLines(path, charset);
        C6562gT0.o(readAllLines, "readAllLines(...)");
        return readAllLines;
    }

    public static /* synthetic */ List r(Path path, Charset charset, int i, Object obj) throws IOException {
        List readAllLines;
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        readAllLines = Files.readAllLines(path, charset);
        C6562gT0.o(readAllLines, "readAllLines(...)");
        return readAllLines;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    @NotNull
    public static final String s(@NotNull Path path, @NotNull Charset charset) throws IOException {
        InputStream newInputStream;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
        InputStreamReader inputStreamReader = new InputStreamReader(newInputStream, charset);
        try {
            String m = C4532Vm2.m(inputStreamReader);
            C5033aE.a(inputStreamReader, null);
            return m;
        } finally {
        }
    }

    public static /* synthetic */ String t(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        return s(path, charset);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final InputStreamReader u(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        InputStream newInputStream;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new InputStreamReader(newInputStream, charset);
    }

    public static /* synthetic */ InputStreamReader v(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        InputStream newInputStream;
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        return new InputStreamReader(newInputStream, charset);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final <T> T w(Path path, Charset charset, HA0<? super B02<String>, ? extends T> ha0) throws IOException {
        BufferedReader newBufferedReader;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(ha0, "block");
        newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            C6562gT0.m(newBufferedReader);
            T invoke = ha0.invoke(C4532Vm2.i(newBufferedReader));
            UP0.d(1);
            C5033aE.a(newBufferedReader, null);
            UP0.c(1);
            return invoke;
        } finally {
        }
    }

    public static /* synthetic */ Object x(Path path, Charset charset, HA0 ha0, int i, Object obj) throws IOException {
        BufferedReader newBufferedReader;
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(ha0, "block");
        newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            C6562gT0.m(newBufferedReader);
            Object invoke = ha0.invoke(C4532Vm2.i(newBufferedReader));
            UP0.d(1);
            C5033aE.a(newBufferedReader, null);
            UP0.c(1);
            return invoke;
        } finally {
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final void y(Path path, byte[] bArr, OpenOption... openOptionArr) throws IOException {
        C6562gT0.p(path, "<this>");
        C6562gT0.p(bArr, "array");
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        Files.write(path, bArr, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path z(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) throws IOException {
        Path write;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(iterable, "lines");
        C6562gT0.p(charset, C4317Th1.g);
        C6562gT0.p(openOptionArr, C9998uW1.m0);
        write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C6562gT0.o(write, "write(...)");
        return write;
    }
}
