package o;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.x01  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10604x01 implements B02<String> {
    @NotNull
    public final BufferedReader a;

    /* renamed from: o.x01$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<String>, GW0 {
        public String X;
        public boolean Y;

        public a() {
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public String next() {
            if (hasNext()) {
                String str = this.X;
                this.X = null;
                C6562gT0.m(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X == null && !this.Y) {
                String readLine = C10604x01.this.a.readLine();
                this.X = readLine;
                if (readLine == null) {
                    this.Y = true;
                }
            }
            if (this.X != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10604x01(@NotNull BufferedReader bufferedReader) {
        C6562gT0.p(bufferedReader, "reader");
        this.a = bufferedReader;
    }

    @Override // o.B02
    @NotNull
    public Iterator<String> iterator() {
        return new a();
    }
}
