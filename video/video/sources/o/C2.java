package o;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.nio.channels.Channel;
import java.nio.file.Path;
import java.nio.file.Paths;
import o.AbstractC11096z2;
import o.C2;

/* loaded from: classes4.dex */
public abstract class C2<T, B extends C2<T, B>> extends AbstractC10371w3<T, B> {
    public AbstractC11096z2<?, ?> a;

    public static AbstractC11096z2.b g(byte[] bArr) {
        return new AbstractC11096z2.b(bArr);
    }

    public static AbstractC11096z2.c h(Channel channel) {
        return new AbstractC11096z2.c(channel);
    }

    public static AbstractC11096z2.d i(CharSequence charSequence) {
        return new AbstractC11096z2.d(charSequence);
    }

    public static AbstractC11096z2.e j(File file) {
        return new AbstractC11096z2.e(file);
    }

    public static AbstractC11096z2.e k(String str) {
        return new AbstractC11096z2.e(new File(str));
    }

    public static AbstractC11096z2.g l(InputStream inputStream) {
        return new AbstractC11096z2.g(inputStream);
    }

    public static AbstractC11096z2.h m(OutputStream outputStream) {
        return new AbstractC11096z2.h(outputStream);
    }

    public static AbstractC11096z2.i n(String str) {
        Path path;
        path = Paths.get(str, new String[0]);
        return new AbstractC11096z2.i(path);
    }

    public static AbstractC11096z2.i o(Path path) {
        return new AbstractC11096z2.i(path);
    }

    public static AbstractC11096z2.f p(C8487oK0 c8487oK0) {
        return new AbstractC11096z2.f(c8487oK0);
    }

    public static AbstractC11096z2.j q(RandomAccessFile randomAccessFile) {
        return new AbstractC11096z2.j(randomAccessFile);
    }

    public static AbstractC11096z2.k r(Reader reader) {
        return new AbstractC11096z2.k(reader);
    }

    public static AbstractC11096z2.l s(URI uri) {
        return new AbstractC11096z2.l(uri);
    }

    public static AbstractC11096z2.m t(Writer writer) {
        return new AbstractC11096z2.m(writer);
    }

    public B A(AbstractC11096z2<?, ?> abstractC11096z2) {
        this.a = abstractC11096z2;
        return (B) c();
    }

    public B B(OutputStream outputStream) {
        return A(m(outputStream));
    }

    public B C(String str) {
        return A(n(str));
    }

    public B D(Path path) {
        return A(o(path));
    }

    public B E(RandomAccessFile randomAccessFile) {
        return A(q(randomAccessFile));
    }

    public B F(C8487oK0 c8487oK0) {
        return A(p(c8487oK0));
    }

    public B G(Reader reader) {
        return A(r(reader));
    }

    public B H(URI uri) {
        return A(s(uri));
    }

    public B I(Writer writer) {
        return A(t(writer));
    }

    public AbstractC11096z2<?, ?> d() {
        AbstractC11096z2<?, ?> abstractC11096z2 = this.a;
        if (abstractC11096z2 != null) {
            return abstractC11096z2;
        }
        throw new IllegalStateException("origin == null");
    }

    public AbstractC11096z2<?, ?> e() {
        return this.a;
    }

    public boolean f() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public B u(byte[] bArr) {
        return A(g(bArr));
    }

    public B v(Channel channel) {
        return A(h(channel));
    }

    public B w(CharSequence charSequence) {
        return A(i(charSequence));
    }

    public B x(File file) {
        return A(j(file));
    }

    public B y(String str) {
        return A(k(str));
    }

    public B z(InputStream inputStream) {
        return A(l(inputStream));
    }
}
