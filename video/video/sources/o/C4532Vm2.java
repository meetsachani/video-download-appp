package o;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "TextStreamsKt")
@InterfaceC8303na2({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,157:1\n57#1:158\n1#2:159\n1#2:162\n1321#3,2:160\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n35#1:158\n35#1:159\n35#1:160,2\n*E\n"})
/* renamed from: o.Vm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4532Vm2 {
    @XP0
    public static final BufferedReader b(Reader reader, int i) {
        C6562gT0.p(reader, "<this>");
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader, i);
    }

    @XP0
    public static final BufferedWriter c(Writer writer, int i) {
        C6562gT0.p(writer, "<this>");
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer, i);
    }

    public static /* synthetic */ BufferedReader d(Reader reader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        C6562gT0.p(reader, "<this>");
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader, i);
    }

    public static /* synthetic */ BufferedWriter e(Writer writer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        C6562gT0.p(writer, "<this>");
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer, i);
    }

    public static final long f(@NotNull Reader reader, @NotNull Writer writer, int i) {
        C6562gT0.p(reader, "<this>");
        C6562gT0.p(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long g(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return f(reader, writer, i);
    }

    public static final void h(@NotNull Reader reader, @NotNull HA0<? super String, C7458kA2> ha0) {
        BufferedReader bufferedReader;
        C6562gT0.p(reader, "<this>");
        C6562gT0.p(ha0, "action");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            for (String str : i(bufferedReader)) {
                ha0.invoke(str);
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            C5033aE.a(bufferedReader, null);
        } finally {
        }
    }

    @NotNull
    public static final B02<String> i(@NotNull BufferedReader bufferedReader) {
        C6562gT0.p(bufferedReader, "<this>");
        return U02.k(new C10604x01(bufferedReader));
    }

    @NotNull
    public static final byte[] j(@NotNull URL url) {
        C6562gT0.p(url, "<this>");
        InputStream openStream = url.openStream();
        try {
            C6562gT0.m(openStream);
            byte[] p = C8372ns.p(openStream);
            C5033aE.a(openStream, null);
            return p;
        } finally {
        }
    }

    @NotNull
    public static final List<String> k(@NotNull Reader reader) {
        C6562gT0.p(reader, "<this>");
        final ArrayList arrayList = new ArrayList();
        h(reader, new HA0() { // from class: o.Um2
            @Override // o.HA0
            public final Object invoke(Object obj) {
                C7458kA2 l;
                l = C4532Vm2.l(arrayList, (String) obj);
                return l;
            }
        });
        return arrayList;
    }

    public static final C7458kA2 l(ArrayList arrayList, String str) {
        C6562gT0.p(str, "it");
        arrayList.add(str);
        return C7458kA2.a;
    }

    @NotNull
    public static final String m(@NotNull Reader reader) {
        C6562gT0.p(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        g(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        C6562gT0.o(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    @XP0
    public static final String n(URL url, Charset charset) {
        C6562gT0.p(url, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new String(j(url), charset);
    }

    public static /* synthetic */ String o(URL url, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = HB.b;
        }
        C6562gT0.p(url, "<this>");
        C6562gT0.p(charset, C4317Th1.g);
        return new String(j(url), charset);
    }

    @XP0
    public static final StringReader p(String str) {
        C6562gT0.p(str, "<this>");
        return new StringReader(str);
    }

    public static final <T> T q(@NotNull Reader reader, @NotNull HA0<? super B02<String>, ? extends T> ha0) {
        BufferedReader bufferedReader;
        C6562gT0.p(reader, "<this>");
        C6562gT0.p(ha0, "block");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            T invoke = ha0.invoke(i(bufferedReader));
            UP0.d(1);
            C5033aE.a(bufferedReader, null);
            UP0.c(1);
            return invoke;
        } finally {
        }
    }
}
