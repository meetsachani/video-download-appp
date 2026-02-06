package org.jsoup.helper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import o.A2;
import o.C11247zf0;
import o.C2730De2;
import o.C4317Th1;
import o.C4538Vo0;
import o.OA;
import o.ZN2;
import org.jsoup.internal.ControllableInputStream;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.SimpleStreamReader;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.parser.StreamParser;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

/* loaded from: classes4.dex */
public final class DataUtil {
    public static final Pattern a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
    public static final Charset b;
    public static final String c;
    public static final int d = 5120;
    public static final char[] e;
    public static final int f = 32;
    public static final Evaluator g;

    /* loaded from: classes4.dex */
    public static class CharsetDoc {
        public Charset a;
        public InputStream b;
        public Document c;

        public CharsetDoc(Charset charset, Document document, InputStream inputStream) {
            this.a = charset;
            this.b = inputStream;
            this.c = document;
        }
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        b = forName;
        c = forName.name();
        e = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        g = Selector.b("meta[http-equiv=content-type], meta[charset]");
    }

    private DataUtil() {
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static CharsetDoc b(ControllableInputStream controllableInputStream, String str, String str2, Parser parser) throws IOException {
        Charset forName;
        XmlDeclaration xmlDeclaration;
        String c2 = c(controllableInputStream);
        if (c2 != null) {
            str = c2;
        }
        Document document = null;
        if (str == null) {
            int j = controllableInputStream.j();
            controllableInputStream.k(5120);
            controllableInputStream.mark(5120);
            controllableInputStream.a(false);
            try {
                try {
                    SimpleStreamReader simpleStreamReader = new SimpleStreamReader(controllableInputStream, b);
                    try {
                        Document p = parser.p(simpleStreamReader, str2);
                        controllableInputStream.reset();
                        controllableInputStream.k(j);
                        simpleStreamReader.close();
                        controllableInputStream.a(true);
                        Iterator<T> it = p.c4(g).iterator();
                        String str3 = null;
                        while (it.hasNext()) {
                            Element element = (Element) it.next();
                            if (element.j0("http-equiv")) {
                                str3 = e(element.k("content"));
                            }
                            if (str3 == null && element.j0(C4317Th1.g)) {
                                str3 = element.k(C4317Th1.g);
                                continue;
                            }
                            if (str3 != null) {
                                break;
                            }
                        }
                        if (str3 == null && p.G() > 0) {
                            Node F = p.F(0);
                            if (F instanceof XmlDeclaration) {
                                xmlDeclaration = (XmlDeclaration) F;
                            } else {
                                if (F instanceof Comment) {
                                    Comment comment = (Comment) F;
                                    if (comment.B1()) {
                                        xmlDeclaration = comment.y1();
                                    }
                                }
                                xmlDeclaration = null;
                            }
                            if (xmlDeclaration != null && xmlDeclaration.B1().equalsIgnoreCase(C2730De2.w)) {
                                str3 = xmlDeclaration.k("encoding");
                            }
                        }
                        String r = r(str3);
                        if (r != null && !r.equalsIgnoreCase(c)) {
                            str = r.trim().replaceAll("[\"']", "");
                        } else if (controllableInputStream.d()) {
                            controllableInputStream.close();
                            document = p;
                        }
                    } catch (Throwable th) {
                        try {
                            simpleStreamReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (UncheckedIOException e2) {
                    throw e2.getCause();
                }
            } catch (Throwable th3) {
                controllableInputStream.a(true);
                throw th3;
            }
        } else {
            Validate.o(str, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        if (str == null) {
            str = c;
        }
        if (str.equals(c)) {
            forName = b;
        } else {
            forName = Charset.forName(str);
        }
        return new CharsetDoc(forName, document, controllableInputStream);
    }

    public static String c(ControllableInputStream controllableInputStream) throws IOException {
        byte[] bArr = new byte[4];
        controllableInputStream.mark(4);
        controllableInputStream.read(bArr, 0, 4);
        controllableInputStream.reset();
        byte b2 = bArr[0];
        if (b2 != 0 || bArr[1] != 0 || bArr[2] != -2 || bArr[3] != -1) {
            if (b2 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0) {
                return ZN2.f1;
            }
            if (b2 != -2 || bArr[1] != -1) {
                if (b2 == -1 && bArr[1] == -2) {
                    return OA.c;
                }
                if (b2 == -17 && bArr[1] == -69 && bArr[2] == -65) {
                    controllableInputStream.read(bArr, 0, 3);
                    return "UTF-8";
                }
                return null;
            }
            return OA.c;
        }
        return ZN2.f1;
    }

    public static ByteBuffer d() {
        return ByteBuffer.allocate(0);
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = a.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return r(matcher.group(1).trim().replace("charset=", ""));
    }

    public static Document f(File file, String str, String str2) throws IOException {
        Path path;
        path = file.toPath();
        return j(path, str, str2);
    }

    public static Document g(File file, String str, String str2, Parser parser) throws IOException {
        Path path;
        path = file.toPath();
        return k(path, str, str2, parser);
    }

    public static Document h(InputStream inputStream, String str, String str2) throws IOException {
        return o(ControllableInputStream.o(inputStream, 0), str, str2, Parser.f());
    }

    public static Document i(InputStream inputStream, String str, String str2, Parser parser) throws IOException {
        return o(ControllableInputStream.o(inputStream, 0), str, str2, parser);
    }

    public static Document j(Path path, String str, String str2) throws IOException {
        return k(path, str, str2, Parser.f());
    }

    public static Document k(Path path, String str, String str2, Parser parser) throws IOException {
        return o(m(path), str, str2, parser);
    }

    public static String l() {
        StringBuilder e2 = StringUtil.e();
        Random random = new Random();
        for (int i = 0; i < 32; i++) {
            char[] cArr = e;
            e2.append(cArr[random.nextInt(cArr.length)]);
        }
        return StringUtil.x(e2);
    }

    public static ControllableInputStream m(Path path) throws IOException {
        boolean z;
        SeekableByteChannel a2 = A2.a(path, new OpenOption[0]);
        InputStream newInputStream = Channels.newInputStream(a2);
        String a3 = Normalizer.a(C4538Vo0.a(C11247zf0.a(path)));
        if (a3.endsWith(".gz") || a3.endsWith(".z")) {
            try {
                if (newInputStream.read() == 31 && newInputStream.read() == 139) {
                    z = true;
                } else {
                    z = false;
                }
                a2.position(0L);
                if (z) {
                    newInputStream = new GZIPInputStream(newInputStream);
                }
            } catch (IOException e2) {
                newInputStream.close();
                throw e2;
            }
        }
        return ControllableInputStream.o(newInputStream, 0);
    }

    public static Document n(CharsetDoc charsetDoc, String str, Parser parser) throws IOException {
        Document document = charsetDoc.c;
        if (document != null) {
            return document;
        }
        InputStream inputStream = charsetDoc.b;
        Validate.q(inputStream);
        Charset charset = charsetDoc.a;
        SimpleStreamReader simpleStreamReader = new SimpleStreamReader(inputStream, charset);
        try {
            try {
                Document p = parser.p(simpleStreamReader, str);
                p.j5().d(charset);
                if (!charset.canEncode()) {
                    p.T4(b);
                }
                simpleStreamReader.close();
                return p;
            } catch (Throwable th) {
                try {
                    simpleStreamReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (UncheckedIOException e2) {
            throw e2.getCause();
        }
    }

    public static Document o(ControllableInputStream controllableInputStream, String str, String str2, Parser parser) throws IOException {
        CharsetDoc charsetDoc;
        if (controllableInputStream == null) {
            return new Document(str2);
        }
        try {
            charsetDoc = b(controllableInputStream, str, str2, parser);
        } catch (Throwable th) {
            th = th;
            charsetDoc = null;
        }
        try {
            Document n = n(charsetDoc, str2, parser);
            if (charsetDoc != null) {
                charsetDoc.b.close();
            }
            return n;
        } catch (Throwable th2) {
            th = th2;
            if (charsetDoc != null) {
                charsetDoc.b.close();
            }
            throw th;
        }
    }

    public static ByteBuffer p(InputStream inputStream, int i) throws IOException {
        return ControllableInputStream.m(inputStream, i);
    }

    public static StreamParser q(Path path, Charset charset, String str, Parser parser) throws IOException {
        String str2;
        StreamParser streamParser = new StreamParser(parser);
        if (charset != null) {
            str2 = charset.name();
        } else {
            str2 = null;
        }
        try {
            CharsetDoc b2 = b(m(path), str2, str, parser);
            streamParser.m(new SimpleStreamReader(b2.b, b2.a), str);
            return streamParser;
        } catch (IOException e2) {
            streamParser.close();
            throw e2;
        }
    }

    public static String r(String str) {
        if (str != null && str.length() != 0) {
            String replaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}
