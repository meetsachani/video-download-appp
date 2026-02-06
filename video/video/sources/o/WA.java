package o;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class WA implements Iterable<Character>, Serializable {
    public static final WA[] Z0 = new WA[0];
    private static final long serialVersionUID = 8270183163158333422L;
    public final char X;
    public final char Y;
    public transient String Y0;
    public final boolean Z;

    /* loaded from: classes4.dex */
    public static class b implements Iterator<Character> {
        public char X;
        public final WA Y;
        public boolean Z;

        @Override // java.util.Iterator
        /* renamed from: b */
        public Character next() {
            if (this.Z) {
                char c = this.X;
                c();
                return Character.valueOf(c);
            }
            throw new NoSuchElementException();
        }

        public final void c() {
            if (this.Y.Z) {
                char c = this.X;
                if (c == 65535) {
                    this.Z = false;
                } else if (c + 1 == this.Y.X) {
                    if (this.Y.Y == 65535) {
                        this.Z = false;
                    } else {
                        this.X = (char) (this.Y.Y + 1);
                    }
                } else {
                    this.X = (char) (this.X + 1);
                }
            } else if (this.X < this.Y.Y) {
                this.X = (char) (this.X + 1);
            } else {
                this.Z = false;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Z;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public b(WA wa) {
            this.Y = wa;
            this.Z = true;
            if (wa.Z) {
                if (wa.X == 0) {
                    if (wa.Y != 65535) {
                        this.X = (char) (wa.Y + 1);
                        return;
                    } else {
                        this.Z = false;
                        return;
                    }
                }
                this.X = (char) 0;
                return;
            }
            this.X = wa.X;
        }
    }

    public WA(char c, char c2, boolean z) {
        if (c > c2) {
            c2 = c;
            c = c2;
        }
        this.X = c;
        this.Y = c2;
        this.Z = z;
    }

    public static WA B(char c, char c2) {
        return new WA(c, c2, true);
    }

    public static WA l(char c) {
        return new WA(c, c, false);
    }

    public static WA p(char c, char c2) {
        return new WA(c, c2, false);
    }

    public static WA w(char c) {
        return new WA(c, c, true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WA)) {
            return false;
        }
        WA wa = (WA) obj;
        if (this.X == wa.X && this.Y == wa.Y && this.Z == wa.Z) {
            return true;
        }
        return false;
    }

    public boolean h(char c) {
        boolean z;
        if (c >= this.X && c <= this.Y) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.Z) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.X + 'S' + (this.Y * 7) + (this.Z ? 1 : 0);
    }

    public boolean i(WA wa) {
        C11147zE2.V(wa, V12.q, new Object[0]);
        if (this.Z) {
            if (wa.Z) {
                if (this.X < wa.X || this.Y > wa.Y) {
                    return false;
                }
                return true;
            } else if (wa.Y >= this.X && wa.X <= this.Y) {
                return false;
            } else {
                return true;
            }
        } else if (wa.Z) {
            if (this.X != 0 || this.Y != 65535) {
                return false;
            }
            return true;
        } else if (this.X > wa.X || this.Y < wa.Y) {
            return false;
        } else {
            return true;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return new b();
    }

    public char j() {
        return this.Y;
    }

    public char k() {
        return this.X;
    }

    public boolean r() {
        return this.Z;
    }

    public String toString() {
        if (this.Y0 == null) {
            StringBuilder sb = new StringBuilder(4);
            if (r()) {
                sb.append('^');
            }
            sb.append(this.X);
            if (this.X != this.Y) {
                sb.append('-');
                sb.append(this.Y);
            }
            this.Y0 = sb.toString();
        }
        return this.Y0;
    }
}
