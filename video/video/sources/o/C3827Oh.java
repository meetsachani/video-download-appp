package o;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@Deprecated
/* renamed from: o.Oh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3827Oh {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 10000;
    public static final int m = 10000000;
    public static final int n = 500000;

    /* renamed from: o  reason: collision with root package name */
    public static final int f577o = 500000;
    @InterfaceC11300zs1
    public final a a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    @ES1(19)
    /* renamed from: o.Oh$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final AudioTrack a;
        public final AudioTimestamp b = new AudioTimestamp();
        public long c;
        public long d;
        public long e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public long a() {
            return this.e;
        }

        public long b() {
            return this.b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }
    }

    public C3827Oh(AudioTrack audioTrack) {
        if (TD2.a >= 19) {
            this.a = new a(audioTrack);
            h();
            return;
        }
        this.a = null;
        i(3);
    }

    public void a() {
        if (this.b == 4) {
            h();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.b();
        }
        return C10323vs.b;
    }

    public boolean d() {
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    public boolean e() {
        int i2 = this.b;
        if (i2 == 1 || i2 == 2) {
            return true;
        }
        return false;
    }

    @TargetApi(19)
    public boolean f(long j2) {
        a aVar = this.a;
        if (aVar == null || j2 - this.e < this.d) {
            return false;
        }
        this.e = j2;
        boolean c = aVar.c();
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c) {
                        h();
                        return c;
                    }
                } else if (!c) {
                    h();
                    return c;
                }
            } else if (c) {
                if (this.a.a() > this.f) {
                    i(2);
                    return c;
                }
            } else {
                h();
                return c;
            }
        } else if (c) {
            if (this.a.b() < this.c) {
                return false;
            }
            this.f = this.a.a();
            i(1);
            return c;
        } else if (j2 - this.c > C6118ei0.r2) {
            i(3);
        }
        return c;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.a != null) {
            i(0);
        }
    }

    public final void i(int i2) {
        this.b = i2;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    if (i2 == 4) {
                        this.d = C6118ei0.r2;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.d = 10000000L;
                return;
            }
            this.d = 10000L;
            return;
        }
        this.e = 0L;
        this.f = -1L;
        this.c = System.nanoTime() / 1000;
        this.d = 10000L;
    }
}
