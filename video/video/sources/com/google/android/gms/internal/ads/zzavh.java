package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public abstract class zzavh implements zzavg {
    public static volatile zzawo p1;
    public MotionEvent X;
    public double e1;
    public double f1;
    public double g1;
    public float h1;
    public float i1;
    public float j1;
    public float k1;
    public DisplayMetrics n1;
    @InterfaceC11300zs1
    public zzawg o1;
    public final LinkedList Y = new LinkedList();
    public long Z = 0;
    public long Y0 = 0;
    public long Z0 = 0;
    public long a1 = 0;
    public long b1 = 0;
    public long c1 = 0;
    public long d1 = 0;
    public boolean l1 = false;
    public boolean m1 = false;

    public zzavh(Context context) {
        try {
            zzauj.e();
            this.n1 = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d3)).booleanValue()) {
                this.o1 = new zzawg();
            }
        } catch (Throwable unused) {
        }
    }

    private final void o() {
        this.b1 = 0L;
        this.Z = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.a1 = 0L;
        this.c1 = 0L;
        this.d1 = 0L;
        LinkedList linkedList = this.Y;
        if (!linkedList.isEmpty()) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        } else {
            MotionEvent motionEvent = this.X;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.X = null;
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String a(Context context) {
        if (!zzawr.c()) {
            return p(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public void b(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String c(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final synchronized void d(int i, int i2, int i3) {
        try {
            if (this.X != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N2)).booleanValue()) {
                    o();
                } else {
                    this.X.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.n1;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.X = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.X = null;
            }
            this.m1 = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final synchronized void e(@InterfaceC11300zs1 MotionEvent motionEvent) {
        Long l;
        try {
            if (this.l1) {
                o();
                this.l1 = false;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 2) {
                    double rawX = motionEvent.getRawX();
                    double rawY = motionEvent.getRawY();
                    double d = rawX - this.f1;
                    double d2 = rawY - this.g1;
                    this.e1 += Math.sqrt((d * d) + (d2 * d2));
                    this.f1 = rawX;
                    this.g1 = rawY;
                }
            } else {
                this.e1 = 0.0d;
                this.f1 = motionEvent.getRawX();
                this.g1 = motionEvent.getRawY();
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 != 1) {
                        if (action2 != 2) {
                            if (action2 == 3) {
                                this.a1++;
                            }
                        } else {
                            this.Y0 += motionEvent.getHistorySize() + 1;
                            zzawq n = n(motionEvent);
                            Long l2 = n.e;
                            if (l2 != null && n.h != null) {
                                this.c1 += l2.longValue() + n.h.longValue();
                            }
                            if (this.n1 != null && (l = n.f) != null && n.i != null) {
                                this.d1 += l.longValue() + n.i.longValue();
                            }
                        }
                    } else {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.X = obtain;
                        LinkedList linkedList = this.Y;
                        linkedList.add(obtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.Z0++;
                        this.b1 = j(new Throwable().getStackTrace());
                    }
                } catch (zzawe unused) {
                }
            } else {
                this.h1 = motionEvent.getX();
                this.i1 = motionEvent.getY();
                this.j1 = motionEvent.getRawX();
                this.k1 = motionEvent.getRawY();
                this.Z++;
            }
            this.m1 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final void f(StackTraceElement[] stackTraceElementArr) {
        zzawg zzawgVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d3)).booleanValue() && (zzawgVar = this.o1) != null) {
            zzawgVar.b(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String g(Context context, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 View view) {
        return p(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String h(Context context, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 View view, @InterfaceC11300zs1 Activity activity) {
        return p(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String i(Context context, @InterfaceC11300zs1 View view, @InterfaceC11300zs1 Activity activity) {
        return p(context, null, 2, view, activity, null);
    }

    public abstract long j(StackTraceElement[] stackTraceElementArr) throws zzawe;

    public abstract zzask k(Context context, View view, Activity activity);

    public abstract zzask l(Context context, zzarx zzarxVar);

    public abstract zzask m(Context context, View view, Activity activity);

    public abstract zzawq n(MotionEvent motionEvent) throws zzawe;

    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String p(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzavf zzavfVar;
        String str2;
        int i2;
        Exception exc;
        int i3;
        int i4;
        String b;
        int i5;
        int i6;
        zzask l;
        int i7;
        int i8;
        zzavf zzavfVar2;
        int i9 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P2)).booleanValue();
        zzask zzaskVar = null;
        if (booleanValue) {
            if (p1 != null) {
                zzavfVar2 = p1.d();
            } else {
                zzavfVar2 = null;
            }
            zzavfVar = zzavfVar2;
            str2 = "be";
        } else {
            zzavfVar = null;
            str2 = null;
        }
        try {
            if (i9 == 3) {
                zzaskVar = k(context, view, activity);
                try {
                    this.l1 = true;
                    i8 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (booleanValue) {
                        if (i9 != i2) {
                        }
                        i3 = i4;
                        zzavfVar.c(i3, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (zzaskVar != null) {
                    }
                    b = Integer.toString(5);
                    return b;
                }
            } else {
                if (i9 == 2) {
                    l = m(context, view, activity);
                    i7 = 1008;
                } else {
                    l = l(context, null);
                    i7 = 1000;
                }
                zzaskVar = l;
                i8 = i7;
            }
            if (booleanValue && zzavfVar != null) {
                i2 = 3;
                try {
                    zzavfVar.c(i8, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    if (booleanValue && zzavfVar != null) {
                        if (i9 != i2) {
                            i4 = 1003;
                        } else if (i9 == 2) {
                            i4 = 1009;
                        } else {
                            i3 = 1001;
                            i9 = 1;
                            zzavfVar.c(i3, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        }
                        i3 = i4;
                        zzavfVar.c(i3, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                    }
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (zzaskVar != null) {
                    }
                    b = Integer.toString(5);
                    return b;
                }
            } else {
                i2 = 3;
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 3;
        }
        long currentTimeMillis222 = System.currentTimeMillis();
        if (zzaskVar != null) {
            try {
            } catch (Exception e4) {
                b = Integer.toString(7);
                if (booleanValue && zzavfVar != null) {
                    if (i9 == i2) {
                        i6 = 1007;
                    } else if (i9 == 2) {
                        i6 = 1011;
                    } else {
                        i6 = 1005;
                    }
                    zzavfVar.c(i6, -1, System.currentTimeMillis() - currentTimeMillis222, str2, e4);
                }
            }
            if (((zzath) zzaskVar.V1()).O0() != 0) {
                int i10 = zzauj.f;
                b = zzauj.b(((zzath) zzaskVar.V1()).b1(), str);
                if (booleanValue && zzavfVar != null) {
                    if (i9 == i2) {
                        i5 = 1006;
                    } else if (i9 == 2) {
                        i5 = 1010;
                    } else {
                        i5 = 1004;
                    }
                    zzavfVar.c(i5, -1, System.currentTimeMillis() - currentTimeMillis222, str2, null);
                }
                return b;
            }
        }
        b = Integer.toString(5);
        return b;
    }
}
