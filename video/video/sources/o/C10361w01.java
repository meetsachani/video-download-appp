package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.w01  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10361w01 implements Iterator<String>, GW0 {
    @NotNull
    public static final a a1 = new a(null);
    @Deprecated
    public static final int b1 = 0;
    @Deprecated
    public static final int c1 = 1;
    @Deprecated
    public static final int d1 = 2;
    @NotNull
    public final CharSequence X;
    public int Y;
    public int Y0;
    public int Z;
    public int Z0;

    /* renamed from: o.w01$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C10361w01(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "string");
        this.X = charSequence;
    }

    @Override // java.util.Iterator
    @NotNull
    /* renamed from: b */
    public String next() {
        if (hasNext()) {
            this.Y = 0;
            int i = this.Y0;
            int i2 = this.Z;
            this.Z = this.Z0 + i;
            return this.X.subSequence(i2, i).toString();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        int i2 = this.Y;
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        int i3 = 2;
        if (this.Z0 < 0) {
            this.Y = 2;
            return false;
        }
        int length = this.X.length();
        int length2 = this.X.length();
        for (int i4 = this.Z; i4 < length2; i4++) {
            char charAt = this.X.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i3 = (charAt == '\r' && (i = i4 + 1) < this.X.length() && this.X.charAt(i) == '\n') ? 1 : 1;
                length = i4;
                this.Y = 1;
                this.Z0 = i3;
                this.Y0 = length;
                return true;
            }
        }
        i3 = -1;
        this.Y = 1;
        this.Z0 = i3;
        this.Y0 = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
