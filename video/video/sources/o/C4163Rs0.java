package o;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* renamed from: o.Rs0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4163Rs0 extends Writer {
    public final Collection<Writer> X;
    public final Collection<Writer> Y;

    public C4163Rs0(Collection<Writer> collection) {
        List list = Collections.EMPTY_LIST;
        this.X = list;
        this.Y = collection == null ? list : collection;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        n(new EJ0() { // from class: o.Gs0
            @Override // o.EJ0
            public final void accept(Object obj) {
                ((Writer) obj).close();
            }
        });
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        n(new EJ0() { // from class: o.Ms0
            @Override // o.EJ0
            public final void accept(Object obj) {
                ((Writer) obj).flush();
            }
        });
    }

    public final C4163Rs0 n(EJ0<Writer> ej0) throws FJ0 {
        EJ0.h(ej0, o());
        return this;
    }

    public final Stream<Writer> o() {
        return this.Y.stream().filter(new Predicate() { // from class: o.Qs0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((Writer) obj);
            }
        });
    }

    @Override // java.io.Writer
    public void write(final char[] cArr) throws IOException {
        n(new EJ0() { // from class: o.Ks0
            @Override // o.EJ0
            public final void accept(Object obj) {
                ((Writer) obj).write(cArr);
            }
        });
    }

    @Override // java.io.Writer
    public void write(final char[] cArr, final int i, final int i2) throws IOException {
        n(new EJ0() { // from class: o.Ls0
            @Override // o.EJ0
            public final void accept(Object obj) {
                ((Writer) obj).write(cArr, i, i2);
            }
        });
    }

    @Override // java.io.Writer
    public void write(final int i) throws IOException {
        n(new EJ0() { // from class: o.Os0
            @Override // o.EJ0
            public final void accept(Object obj) {
                ((Writer) obj).write(i);
            }
        });
    }

    public C4163Rs0(Writer... writerArr) {
        List list = Collections.EMPTY_LIST;
        this.X = list;
        this.Y = writerArr != null ? Arrays.asList(writerArr) : list;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(final char c) throws IOException {
        return n(new EJ0() { // from class: o.Ps0
            @Override // o.EJ0
            public final void accept(Object obj) {
                ((Writer) obj).append(c);
            }
        });
    }

    @Override // java.io.Writer
    public void write(final String str) throws IOException {
        n(new EJ0() { // from class: o.Is0
            @Override // o.EJ0
            public final void accept(Object obj) {
                ((Writer) obj).write(str);
            }
        });
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(final CharSequence charSequence) throws IOException {
        return n(new EJ0() { // from class: o.Js0
            @Override // o.EJ0
            public final void accept(Object obj) {
                ((Writer) obj).append(charSequence);
            }
        });
    }

    @Override // java.io.Writer
    public void write(final String str, final int i, final int i2) throws IOException {
        n(new EJ0() { // from class: o.Ns0
            @Override // o.EJ0
            public final void accept(Object obj) {
                ((Writer) obj).write(str, i, i2);
            }
        });
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(final CharSequence charSequence, final int i, final int i2) throws IOException {
        return n(new EJ0() { // from class: o.Hs0
            @Override // o.EJ0
            public final void accept(Object obj) {
                ((Writer) obj).append(charSequence, i, i2);
            }
        });
    }
}
