package o;

import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC2824Ed2;
import o.AbstractC3044Gh;
import o.AbstractC3242Ih1;
import o.C2837Eh;
import o.C3051Gi2;
import o.C3679Mt;
import o.C7033iP1;
import o.CG2;
import o.InterfaceC11231zb0;
import o.InterfaceC9694tG2;
import o.QG2;

/* renamed from: o.iP1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7033iP1 implements InterfaceC9694tG2 {
    public static final String g0 = "Recorder";
    public static final Set<l> h0 = Collections.unmodifiableSet(EnumSet.of(l.PENDING_RECORDING, l.PENDING_PAUSED));
    public static final Set<l> i0 = Collections.unmodifiableSet(EnumSet.of(l.CONFIGURING, l.IDLING, l.RESETTING, l.STOPPING, l.ERROR));
    public static final C6276fL1 j0;
    public static final QG2 k0;
    public static final AbstractC3242Ih1 l0;
    public static final String m0 = "_data";
    public static final Exception n0;
    public static final int o0 = 1;
    public static final int p0 = 0;
    public static final long q0 = 1000;
    public static final int r0 = 60;
    public static final InterfaceC3119Hb0 s0;
    public static final Executor t0;
    public MediaMuxer A;
    public final C4244Sn1<AbstractC3242Ih1> B;
    public C2837Eh C;
    public InterfaceC11231zb0 D;
    public InterfaceC2897Ew1 E;
    public InterfaceC11231zb0 F;
    public InterfaceC2897Ew1 G;
    public i H;
    public Uri I;
    public long J;
    public long K;
    public long L;
    public int M;
    public Range<Integer> N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public int T;
    public Throwable U;
    public InterfaceC10013ub0 V;
    public final NU1<InterfaceC10013ub0> W;
    public Throwable X;
    public boolean Y;
    public InterfaceC9694tG2.a Z;
    public final C4244Sn1<AbstractC2824Ed2> a;
    public ScheduledFuture<?> a0;
    public final Executor b;
    public boolean b0;
    public final Executor c;
    public XF2 c0;
    public final Executor d;
    public XF2 d0;
    public final InterfaceC3119Hb0 e;
    public double e0;
    public final InterfaceC3119Hb0 f;
    public boolean f0;
    public final Object g = new Object();
    public final boolean h;
    public l i;
    public l j;
    public int k;
    public k l;
    public k m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public k f769o;
    public boolean p;
    public C3051Gi2.h q;
    public C3051Gi2.h r;
    public VG2 s;
    public final List<InterfaceFutureC8411o11<Void>> t;
    public Integer u;
    public Integer v;
    public C3051Gi2 w;
    public EnumC5905dp2 x;
    public Surface y;
    public Surface z;

    /* renamed from: o.iP1$a */
    /* loaded from: classes.dex */
    public class a implements XB0<InterfaceC11231zb0> {
        public final /* synthetic */ XF2 a;

        public a(XF2 xf2) {
            this.a = xf2;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            C7433k41.a(C7033iP1.g0, "VideoEncoder Setup error: " + th);
            C7033iP1.this.V(th);
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(InterfaceC11231zb0 interfaceC11231zb0) {
            boolean z;
            C7433k41.a(C7033iP1.g0, "VideoEncoder is created. " + interfaceC11231zb0);
            if (interfaceC11231zb0 == null) {
                return;
            }
            boolean z2 = false;
            if (C7033iP1.this.c0 == this.a) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.n(z);
            if (C7033iP1.this.D == null) {
                z2 = true;
            }
            C10907yF1.n(z2);
            C7033iP1.this.b0(this.a);
            C7033iP1.this.U();
        }
    }

    /* renamed from: o.iP1$b */
    /* loaded from: classes.dex */
    public class b implements XB0<InterfaceC11231zb0> {
        public final /* synthetic */ XF2 a;

        public b(XF2 xf2) {
            this.a = xf2;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            C7433k41.a(C7033iP1.g0, "Error in ReadyToReleaseFuture: " + th);
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(InterfaceC11231zb0 interfaceC11231zb0) {
            InterfaceC11231zb0 interfaceC11231zb02;
            C7433k41.a(C7033iP1.g0, "VideoEncoder can be released: " + interfaceC11231zb0);
            if (interfaceC11231zb0 == null) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = C7033iP1.this.a0;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (interfaceC11231zb02 = C7033iP1.this.D) != null && interfaceC11231zb02 == interfaceC11231zb0) {
                C7033iP1.T(interfaceC11231zb02);
            }
            C7033iP1 c7033iP1 = C7033iP1.this;
            c7033iP1.d0 = this.a;
            c7033iP1.s0(null);
            C7033iP1 c7033iP12 = C7033iP1.this;
            c7033iP12.j0(4, null, c7033iP12.O());
        }
    }

    /* renamed from: o.iP1$c */
    /* loaded from: classes.dex */
    public class c implements XB0<Void> {
        public final /* synthetic */ C2837Eh a;

        public c(C2837Eh c2837Eh) {
            this.a = c2837Eh;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            C7433k41.a(C7033iP1.g0, String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.a.hashCode())));
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r2) {
            C7433k41.a(C7033iP1.g0, String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.a.hashCode())));
        }
    }

    /* renamed from: o.iP1$e */
    /* loaded from: classes.dex */
    public class e implements C2837Eh.d {
        public final /* synthetic */ InterfaceC10929yL a;

        public e(InterfaceC10929yL interfaceC10929yL) {
            this.a = interfaceC10929yL;
        }

        @Override // o.C2837Eh.d
        public void a(boolean z) {
            C7033iP1 c7033iP1 = C7033iP1.this;
            if (c7033iP1.Y != z) {
                c7033iP1.Y = z;
                c7033iP1.I0();
                return;
            }
            C7433k41.p(C7033iP1.g0, "Audio source silenced transitions to the same state " + z);
        }

        @Override // o.C2837Eh.d
        public void b(double d) {
            C7033iP1.this.e0 = d;
        }

        @Override // o.C2837Eh.d
        public void onError(Throwable th) {
            C7433k41.d(C7033iP1.g0, "Error occurred after audio source started.", th);
            if (th instanceof C2946Fh) {
                this.a.accept(th);
            }
        }
    }

    /* renamed from: o.iP1$g */
    /* loaded from: classes.dex */
    public class g implements XB0<List<Void>> {
        public g() {
        }

        @Override // o.XB0
        public void b(Throwable th) {
            boolean z;
            int i;
            if (C7033iP1.this.f769o != null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "In-progress recording shouldn't be null");
            if (!C7033iP1.this.f769o.v()) {
                C7433k41.a(C7033iP1.g0, "Encodings end with error: " + th);
                C7033iP1 c7033iP1 = C7033iP1.this;
                if (c7033iP1.A == null) {
                    i = 8;
                } else {
                    i = 6;
                }
                c7033iP1.z(i, th);
            }
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(List<Void> list) {
            C7433k41.a(C7033iP1.g0, "Encodings end successfully.");
            C7033iP1 c7033iP1 = C7033iP1.this;
            c7033iP1.z(c7033iP1.T, c7033iP1.U);
        }
    }

    /* renamed from: o.iP1$h */
    /* loaded from: classes.dex */
    public static /* synthetic */ class h {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[i.values().length];
            b = iArr;
            try {
                iArr[i.ERROR_ENCODER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[i.ERROR_SOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[i.ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[i.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[i.IDLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[i.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[l.values().length];
            a = iArr2;
            try {
                iArr2[l.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[l.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[l.PENDING_PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[l.PENDING_RECORDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[l.RESETTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[l.STOPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[l.CONFIGURING.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[l.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[l.IDLING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: o.iP1$i */
    /* loaded from: classes.dex */
    public enum i {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    /* renamed from: o.iP1$j */
    /* loaded from: classes.dex */
    public static final class j {
        public final AbstractC3242Ih1.a a;
        public Executor b = null;
        public InterfaceC3119Hb0 c;
        public InterfaceC3119Hb0 d;

        public j() {
            InterfaceC3119Hb0 interfaceC3119Hb0 = C7033iP1.s0;
            this.c = interfaceC3119Hb0;
            this.d = interfaceC3119Hb0;
            this.a = AbstractC3242Ih1.a();
        }

        public C7033iP1 e() {
            return new C7033iP1(this.b, this.a.a(), this.c, this.d);
        }

        public j f(final int i) {
            this.a.c(new InterfaceC10929yL() { // from class: o.lP1
                @Override // o.InterfaceC10929yL
                public final void accept(Object obj) {
                    ((QG2.a) obj).b(i);
                }
            });
            return this;
        }

        public j g(InterfaceC3119Hb0 interfaceC3119Hb0) {
            this.d = interfaceC3119Hb0;
            return this;
        }

        public j h(final int i) {
            this.a.b(new InterfaceC10929yL() { // from class: o.kP1
                @Override // o.InterfaceC10929yL
                public final void accept(Object obj) {
                    ((AbstractC3044Gh.a) obj).e(i);
                }
            });
            return this;
        }

        public j i(Executor executor) {
            C10907yF1.m(executor, "The specified executor can't be null.");
            this.b = executor;
            return this;
        }

        public j j(final C6276fL1 c6276fL1) {
            C10907yF1.m(c6276fL1, "The specified quality selector can't be null.");
            this.a.c(new InterfaceC10929yL() { // from class: o.mP1
                @Override // o.InterfaceC10929yL
                public final void accept(Object obj) {
                    ((QG2.a) obj).e(C6276fL1.this);
                }
            });
            return this;
        }

        public j k(final int i) {
            if (i > 0) {
                this.a.c(new InterfaceC10929yL() { // from class: o.jP1
                    @Override // o.InterfaceC10929yL
                    public final void accept(Object obj) {
                        ((QG2.a) obj).c(new Range<>(Integer.valueOf(r0), Integer.valueOf(i)));
                    }
                });
                return this;
            }
            throw new IllegalArgumentException("The requested target bitrate " + i + " is not supported. Target bitrate must be greater than 0.");
        }

        public j l(InterfaceC3119Hb0 interfaceC3119Hb0) {
            this.c = interfaceC3119Hb0;
            return this;
        }
    }

    /* renamed from: o.iP1$k */
    /* loaded from: classes.dex */
    public static abstract class k implements AutoCloseable {
        public final RD X = RD.b();
        public final AtomicBoolean Y = new AtomicBoolean(false);
        public final AtomicReference<d> Z = new AtomicReference<>(null);
        public final AtomicReference<c> Y0 = new AtomicReference<>(null);
        public final AtomicReference<InterfaceC10929yL<Uri>> Z0 = new AtomicReference<>(new InterfaceC10929yL() { // from class: o.sP1
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                C7033iP1.k.d((Uri) obj);
            }
        });
        public final AtomicBoolean a1 = new AtomicBoolean(false);

        /* renamed from: o.iP1$k$a */
        /* loaded from: classes.dex */
        public class a implements c {
            public final /* synthetic */ Context a;

            public a(Context context) {
                this.a = context;
            }

            @Override // o.C7033iP1.k.c
            public C2837Eh a(AbstractC8328nh abstractC8328nh, Executor executor) throws C2946Fh {
                return new C2837Eh(abstractC8328nh, executor, this.a);
            }
        }

        /* renamed from: o.iP1$k$b */
        /* loaded from: classes.dex */
        public class b implements c {
            public b() {
            }

            @Override // o.C7033iP1.k.c
            public C2837Eh a(AbstractC8328nh abstractC8328nh, Executor executor) throws C2946Fh {
                return new C2837Eh(abstractC8328nh, executor, null);
            }
        }

        /* renamed from: o.iP1$k$c */
        /* loaded from: classes.dex */
        public interface c {
            C2837Eh a(AbstractC8328nh abstractC8328nh, Executor executor) throws C2946Fh;
        }

        /* renamed from: o.iP1$k$d */
        /* loaded from: classes.dex */
        public interface d {
            MediaMuxer a(int i, InterfaceC10929yL<Uri> interfaceC10929yL) throws IOException;
        }

        public static /* synthetic */ void a(String str, Uri uri) {
            if (uri == null) {
                C7433k41.c(C7033iP1.g0, String.format("File scanning operation failed [path: %s]", str));
            } else {
                C7433k41.a(C7033iP1.g0, String.format("File scan completed successfully [path: %s, URI: %s]", str, uri));
            }
        }

        public static /* synthetic */ void d(Uri uri) {
        }

        public static /* synthetic */ void f(C3536Lh1 c3536Lh1, Context context, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            String b2 = C6677gx1.b(c3536Lh1.e(), uri, C7033iP1.m0);
            if (b2 != null) {
                MediaScannerConnection.scanFile(context, new String[]{b2}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: o.rP1
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri2) {
                        C7033iP1.k.a(str, uri2);
                    }
                });
                return;
            }
            C7433k41.a(C7033iP1.g0, "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
        }

        public static /* synthetic */ void h(C3536Lh1 c3536Lh1, Uri uri) {
            if (uri.equals(Uri.EMPTY)) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_pending", (Integer) 0);
            c3536Lh1.e().update(uri, contentValues, null, null);
        }

        public static /* synthetic */ MediaMuxer j(AbstractC5209ax1 abstractC5209ax1, ParcelFileDescriptor parcelFileDescriptor, int i, InterfaceC10929yL interfaceC10929yL) {
            MediaMuxer a2;
            MediaMuxer mediaMuxer;
            Uri uri = Uri.EMPTY;
            if (abstractC5209ax1 instanceof C9583sp0) {
                File d2 = ((C9583sp0) abstractC5209ax1).d();
                if (!C6677gx1.a(d2)) {
                    C7433k41.p(C7033iP1.g0, "Failed to create folder for " + d2.getAbsolutePath());
                }
                mediaMuxer = new MediaMuxer(d2.getAbsolutePath(), i);
                uri = Uri.fromFile(d2);
            } else if (abstractC5209ax1 instanceof C5903dp0) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaMuxer = C11226za.a(parcelFileDescriptor.getFileDescriptor(), i);
                } else {
                    throw new IOException("MediaMuxer doesn't accept FileDescriptor as output destination.");
                }
            } else if (abstractC5209ax1 instanceof C3536Lh1) {
                C3536Lh1 c3536Lh1 = (C3536Lh1) abstractC5209ax1;
                ContentValues contentValues = new ContentValues(c3536Lh1.f());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    contentValues.put("is_pending", (Integer) 1);
                }
                try {
                    Uri insert = c3536Lh1.e().insert(c3536Lh1.d(), contentValues);
                    if (insert != null) {
                        if (i2 < 26) {
                            String b2 = C6677gx1.b(c3536Lh1.e(), insert, C7033iP1.m0);
                            if (b2 != null) {
                                if (!C6677gx1.a(new File(b2))) {
                                    C7433k41.p(C7033iP1.g0, "Failed to create folder for " + b2);
                                }
                                a2 = new MediaMuxer(b2, i);
                            } else {
                                throw new IOException("Unable to get path from uri " + insert);
                            }
                        } else {
                            ParcelFileDescriptor openFileDescriptor = c3536Lh1.e().openFileDescriptor(insert, FN1.c1);
                            a2 = C11226za.a(openFileDescriptor.getFileDescriptor(), i);
                            openFileDescriptor.close();
                        }
                        uri = insert;
                        mediaMuxer = a2;
                    } else {
                        throw new IOException("Unable to create MediaStore entry.");
                    }
                } catch (RuntimeException e) {
                    throw new IOException("Unable to create MediaStore entry by " + e, e);
                }
            } else {
                throw new AssertionError("Invalid output options type: " + abstractC5209ax1.getClass().getSimpleName());
            }
            interfaceC10929yL.accept(uri);
            return mediaMuxer;
        }

        public static /* synthetic */ void k(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
                C7433k41.d(C7033iP1.g0, "Failed to close dup'd ParcelFileDescriptor", e);
            }
        }

        public static k n(C9677tC1 c9677tC1, long j) {
            return new C7589kj(c9677tC1.e(), c9677tC1.d(), c9677tC1.c(), c9677tC1.g(), c9677tC1.h(), j);
        }

        public void A(final CG2 cg2) {
            CG2.a aVar;
            if (Objects.equals(cg2.c(), q())) {
                String str = "Sending VideoRecordEvent " + cg2.getClass().getSimpleName();
                if (cg2 instanceof CG2.a) {
                    if (((CG2.a) cg2).m()) {
                        str = str + String.format(" [error: %s]", CG2.a.i(aVar.k()));
                    }
                }
                C7433k41.a(C7033iP1.g0, str);
                if (o() != null && p() != null) {
                    try {
                        o().execute(new Runnable() { // from class: o.tP1
                            @Override // java.lang.Runnable
                            public final void run() {
                                C7033iP1.k.this.p().accept(cg2);
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e) {
                        C7433k41.d(C7033iP1.g0, "The callback executor is invalid.", e);
                        return;
                    }
                }
                return;
            }
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + cg2.c() + ", Expected: " + q() + C6566gU0.g);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            l(Uri.EMPTY);
        }

        public void finalize() throws Throwable {
            try {
                this.X.d();
                InterfaceC10929yL<Uri> andSet = this.Z0.getAndSet(null);
                if (andSet != null) {
                    m(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        public void l(Uri uri) {
            if (!this.Y.get()) {
                return;
            }
            m(this.Z0.getAndSet(null), uri);
        }

        public final void m(InterfaceC10929yL<Uri> interfaceC10929yL, Uri uri) {
            if (interfaceC10929yL != null) {
                this.X.a();
                interfaceC10929yL.accept(uri);
                return;
            }
            throw new AssertionError("Recording " + this + " has already been finalized");
        }

        public abstract Executor o();

        public abstract InterfaceC10929yL<CG2> p();

        public abstract AbstractC5209ax1 q();

        public abstract long r();

        public abstract boolean s();

        public void t(final Context context) throws IOException {
            final ParcelFileDescriptor parcelFileDescriptor;
            if (!this.Y.getAndSet(true)) {
                final AbstractC5209ax1 q = q();
                boolean z = q instanceof C5903dp0;
                InterfaceC10929yL<Uri> interfaceC10929yL = null;
                if (z) {
                    parcelFileDescriptor = ((C5903dp0) q).d().dup();
                } else {
                    parcelFileDescriptor = null;
                }
                this.X.c("finalizeRecording");
                this.Z.set(new d() { // from class: o.nP1
                    @Override // o.C7033iP1.k.d
                    public final MediaMuxer a(int i, InterfaceC10929yL interfaceC10929yL2) {
                        return C7033iP1.k.j(AbstractC5209ax1.this, parcelFileDescriptor, i, interfaceC10929yL2);
                    }
                });
                if (s()) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        this.Y0.set(new a(context));
                    } else {
                        this.Y0.set(new b());
                    }
                }
                if (q instanceof C3536Lh1) {
                    final C3536Lh1 c3536Lh1 = (C3536Lh1) q;
                    if (Build.VERSION.SDK_INT >= 29) {
                        interfaceC10929yL = new InterfaceC10929yL() { // from class: o.oP1
                            @Override // o.InterfaceC10929yL
                            public final void accept(Object obj) {
                                C7033iP1.k.h(C3536Lh1.this, (Uri) obj);
                            }
                        };
                    } else {
                        interfaceC10929yL = new InterfaceC10929yL() { // from class: o.pP1
                            @Override // o.InterfaceC10929yL
                            public final void accept(Object obj) {
                                C7033iP1.k.f(C3536Lh1.this, context, (Uri) obj);
                            }
                        };
                    }
                } else if (z) {
                    interfaceC10929yL = new InterfaceC10929yL() { // from class: o.qP1
                        @Override // o.InterfaceC10929yL
                        public final void accept(Object obj) {
                            C7033iP1.k.k(parcelFileDescriptor, (Uri) obj);
                        }
                    };
                }
                if (interfaceC10929yL != null) {
                    this.Z0.set(interfaceC10929yL);
                    return;
                }
                return;
            }
            throw new AssertionError("Recording " + this + " has already been initialized");
        }

        public boolean u() {
            return this.a1.get();
        }

        public abstract boolean v();

        public void x(boolean z) {
            this.a1.set(z);
        }

        public C2837Eh y(AbstractC8328nh abstractC8328nh, Executor executor) throws C2946Fh {
            if (s()) {
                c andSet = this.Y0.getAndSet(null);
                if (andSet != null) {
                    return andSet.a(abstractC8328nh, executor);
                }
                throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
            }
            throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
        }

        public MediaMuxer z(int i, InterfaceC10929yL<Uri> interfaceC10929yL) throws IOException {
            if (this.Y.get()) {
                d andSet = this.Z.getAndSet(null);
                if (andSet != null) {
                    try {
                        return andSet.a(i, interfaceC10929yL);
                    } catch (RuntimeException e) {
                        throw new IOException("Failed to create MediaMuxer by " + e, e);
                    }
                }
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            throw new AssertionError("Recording " + this + " has not been initialized");
        }
    }

    /* renamed from: o.iP1$l */
    /* loaded from: classes.dex */
    public enum l {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        C5548cL1 c5548cL1 = C5548cL1.c;
        C6276fL1 g2 = C6276fL1.g(Arrays.asList(c5548cL1, C5548cL1.b, C5548cL1.a), C6879hn0.a(c5548cL1));
        j0 = g2;
        QG2 a2 = QG2.a().e(g2).b(-1).a();
        k0 = a2;
        l0 = AbstractC3242Ih1.a().g(-1).h(a2).a();
        n0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        s0 = new InterfaceC3119Hb0() { // from class: o.YO1
            @Override // o.InterfaceC3119Hb0
            public final InterfaceC11231zb0 a(Executor executor, InterfaceC2923Fb0 interfaceC2923Fb0) {
                return new C4884Zb0(executor, interfaceC2923Fb0);
            }
        };
        t0 = C5211ay.i(C5211ay.d());
    }

    public C7033iP1(Executor executor, AbstractC3242Ih1 abstractC3242Ih1, InterfaceC3119Hb0 interfaceC3119Hb0, InterfaceC3119Hb0 interfaceC3119Hb02) {
        boolean z;
        if (V20.a(C10992yc0.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        this.i = l.CONFIGURING;
        this.j = null;
        this.k = 0;
        this.l = null;
        this.m = null;
        this.n = 0L;
        this.f769o = null;
        this.p = false;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = new ArrayList();
        this.u = null;
        this.v = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = i.INITIALIZING;
        this.I = Uri.EMPTY;
        this.J = 0L;
        this.K = 0L;
        this.L = Long.MAX_VALUE;
        this.M = 0;
        this.N = null;
        this.O = Long.MAX_VALUE;
        this.P = Long.MAX_VALUE;
        this.Q = Long.MAX_VALUE;
        this.R = 0L;
        this.S = 0L;
        this.T = 1;
        this.U = null;
        this.V = null;
        this.W = new C3032Ge(60);
        this.X = null;
        this.Y = false;
        this.Z = InterfaceC9694tG2.a.INACTIVE;
        this.a0 = null;
        this.b0 = false;
        this.d0 = null;
        this.e0 = 0.0d;
        this.f0 = false;
        this.b = executor;
        executor = executor == null ? C5211ay.d() : executor;
        this.c = executor;
        Executor i2 = C5211ay.i(executor);
        this.d = i2;
        this.B = C4244Sn1.l(x(abstractC3242Ih1));
        this.a = C4244Sn1.l(AbstractC2824Ed2.d(this.k, L(this.i)));
        this.e = interfaceC3119Hb0;
        this.f = interfaceC3119Hb02;
        this.c0 = new XF2(interfaceC3119Hb0, i2, executor);
    }

    public static int E0(VG2 vg2, int i2) {
        if (vg2 != null) {
            int e2 = vg2.e();
            if (e2 != 1) {
                if (e2 == 2) {
                    return 0;
                }
                if (e2 == 9) {
                    return 1;
                }
            } else if (Build.VERSION.SDK_INT < 26) {
                return 0;
            } else {
                return 2;
            }
        }
        return i2;
    }

    public static InterfaceC7235jF2 J(InterfaceC6420fx interfaceC6420fx) {
        return C9972uP1.j(interfaceC6420fx);
    }

    public static boolean P(C10215vP1 c10215vP1, k kVar) {
        if (kVar == null || c10215vP1.h() != kVar.r()) {
            return false;
        }
        return true;
    }

    public static void T(InterfaceC11231zb0 interfaceC11231zb0) {
        if (interfaceC11231zb0 instanceof C4884Zb0) {
            ((C4884Zb0) interfaceC11231zb0).S();
        }
    }

    public static /* synthetic */ void h(InterfaceC11231zb0 interfaceC11231zb0) {
        C7433k41.a(g0, "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (V20.a(C10968yV.class) != null) {
            T(interfaceC11231zb0);
        }
    }

    public static /* synthetic */ void j(C7033iP1 c7033iP1, C3051Gi2 c3051Gi2, EnumC5905dp2 enumC5905dp2) {
        c7033iP1.getClass();
        if (!c3051Gi2.s() && (!c7033iP1.c0.n(c3051Gi2) || c7033iP1.O())) {
            XF2 xf2 = new XF2(c7033iP1.e, c7033iP1.d, c7033iP1.c);
            InterfaceFutureC8411o11<InterfaceC11231zb0> i2 = xf2.i(c3051Gi2, enumC5905dp2, (AbstractC3242Ih1) c7033iP1.G(c7033iP1.B), c7033iP1.s);
            c7033iP1.c0 = xf2;
            C7221jC0.b(i2, new a(xf2), c7033iP1.d);
            return;
        }
        C7433k41.p(g0, "Ignore the SurfaceRequest " + c3051Gi2 + " isServiced: " + c3051Gi2.s() + " VideoEncoderSession: " + c7033iP1.c0 + " has been configured with a persistent in-progress recording.");
    }

    public static /* synthetic */ void k(C7033iP1 c7033iP1, C3679Mt.a aVar, Throwable th) {
        if (c7033iP1.X == null) {
            if (th instanceof C9035qb0) {
                c7033iP1.q0(i.ERROR_ENCODER);
            } else {
                c7033iP1.q0(i.ERROR_SOURCE);
            }
            c7033iP1.X = th;
            c7033iP1.I0();
            aVar.c(null);
        }
    }

    public static /* synthetic */ void s(C7033iP1 c7033iP1) {
        C3051Gi2 c3051Gi2 = c7033iP1.w;
        if (c3051Gi2 != null) {
            c7033iP1.y(c3051Gi2, c7033iP1.x);
            return;
        }
        throw new AssertionError("surface request is required to retry initialization.");
    }

    public static /* synthetic */ Object t(C7033iP1 c7033iP1, k kVar, C3679Mt.a aVar) {
        c7033iP1.D.c(new d(aVar, kVar), c7033iP1.d);
        return "videoEncodingFuture";
    }

    public static /* synthetic */ Object u(final C7033iP1 c7033iP1, k kVar, final C3679Mt.a aVar) {
        c7033iP1.getClass();
        InterfaceC10929yL interfaceC10929yL = new InterfaceC10929yL() { // from class: o.QO1
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                C7033iP1.k(C7033iP1.this, aVar, (Throwable) obj);
            }
        };
        c7033iP1.C.B(c7033iP1.d, new e(interfaceC10929yL));
        c7033iP1.F.c(new f(aVar, interfaceC10929yL, kVar), c7033iP1.d);
        return "audioEncodingFuture";
    }

    public final void A(k kVar, int i2, Throwable th) {
        Uri uri = Uri.EMPTY;
        kVar.l(uri);
        kVar.A(CG2.b(kVar.q(), AbstractC10461wP1.d(0L, 0L, AbstractC3142Hh.g(1, this.X, 0.0d)), AbstractC5452bx1.b(uri), i2, th));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(k kVar) {
        i iVar;
        i iVar2;
        if (this.f769o == null) {
            if (kVar.q().b() > 0) {
                this.R = Math.round(kVar.q().b() * 0.95d);
                C7433k41.a(g0, "File size limit in bytes: " + this.R);
            } else {
                this.R = 0L;
            }
            if (kVar.q().a() > 0) {
                this.S = TimeUnit.MILLISECONDS.toNanos(kVar.q().a());
                C7433k41.a(g0, "Duration limit in nanoseconds: " + this.S);
            } else {
                this.S = 0L;
            }
            this.f769o = kVar;
            switch (h.b[this.H.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.H);
                case 5:
                    if (kVar.s()) {
                        iVar = i.ENABLED;
                    } else {
                        iVar = i.DISABLED;
                    }
                    q0(iVar);
                    break;
                case 6:
                    if (kVar.s()) {
                        if (N()) {
                            try {
                                if (this.f769o.v()) {
                                    if (this.F == null) {
                                    }
                                    q0(i.ENABLED);
                                }
                                w0(kVar);
                                q0(i.ENABLED);
                            } catch (C2946Fh e2) {
                                e = e2;
                                C7433k41.d(g0, "Unable to create audio resource with error: ", e);
                                if (!(e instanceof C8279nT0)) {
                                    iVar2 = i.ERROR_ENCODER;
                                } else {
                                    iVar2 = i.ERROR_SOURCE;
                                }
                                q0(iVar2);
                                this.X = e;
                                H0(kVar, false);
                                if (M()) {
                                }
                                this.D.start();
                                k kVar2 = this.f769o;
                                kVar2.A(CG2.g(kVar2.q(), F()));
                                return;
                            } catch (C8279nT0 e3) {
                                e = e3;
                                C7433k41.d(g0, "Unable to create audio resource with error: ", e);
                                if (!(e instanceof C8279nT0)) {
                                }
                                q0(iVar2);
                                this.X = e;
                                H0(kVar, false);
                                if (M()) {
                                }
                                this.D.start();
                                k kVar22 = this.f769o;
                                kVar22.A(CG2.g(kVar22.q(), F()));
                                return;
                            }
                        } else {
                            throw new AssertionError("The Recorder doesn't support recording with audio");
                        }
                    }
                    break;
            }
            H0(kVar, false);
            if (M()) {
                this.C.F(kVar.u());
                this.F.start();
            }
            this.D.start();
            k kVar222 = this.f769o;
            kVar222.A(CG2.g(kVar222.q(), F()));
            return;
        }
        throw new AssertionError("Attempted to start a new recording while another was in progress.");
    }

    public int B() {
        return ((AbstractC3242Ih1) G(this.B)).d().b();
    }

    public final void B0(k kVar, boolean z) {
        A0(kVar);
        if (z) {
            d0(kVar);
        }
    }

    public final List<InterfaceC10013ub0> C(long j2) {
        ArrayList arrayList = new ArrayList();
        while (!this.W.isEmpty()) {
            InterfaceC10013ub0 b2 = this.W.b();
            if (b2.r2() >= j2) {
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void C0(C10215vP1 c10215vP1, int i2, Throwable th) {
        Throwable th2;
        final int i3;
        final Throwable th3;
        synchronized (this.g) {
            try {
                try {
                    if (!P(c10215vP1, this.m)) {
                        try {
                            if (!P(c10215vP1, this.l)) {
                                C7433k41.a(g0, "stop() called on a recording that is no longer active: " + c10215vP1.f());
                                return;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            throw th2;
                        }
                    }
                    k kVar = null;
                    switch (h.a[this.i.ordinal()]) {
                        case 1:
                        case 2:
                            t0(l.STOPPING);
                            final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                            final k kVar2 = this.l;
                            i3 = i2;
                            th3 = th;
                            this.d.execute(new Runnable() { // from class: o.hP1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C7033iP1.this.D0(kVar2, micros, i3, th3);
                                }
                            });
                            break;
                        case 3:
                        case 4:
                            C10907yF1.n(P(c10215vP1, this.m));
                            k kVar3 = this.m;
                            this.m = null;
                            m0();
                            kVar = kVar3;
                            i3 = i2;
                            th3 = th;
                            break;
                        case 5:
                        case 6:
                            C10907yF1.n(P(c10215vP1, this.l));
                            i3 = i2;
                            th3 = th;
                            break;
                        case 7:
                        case 9:
                            throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                        case 8:
                        default:
                            i3 = i2;
                            th3 = th;
                            break;
                    }
                    if (kVar != null) {
                        if (i3 == 10) {
                            C7433k41.c(g0, "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                        }
                        A(kVar, 8, new RuntimeException("Recording was stopped before any data could be produced.", th3));
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th6) {
                th = th6;
                th2 = th;
                throw th2;
            }
        }
    }

    public int D() {
        return ((AbstractC3242Ih1) G(this.B)).b().e();
    }

    public void D0(k kVar, long j2, int i2, Throwable th) {
        if (this.f769o == kVar && !this.p) {
            this.p = true;
            this.T = i2;
            this.U = th;
            if (M()) {
                w();
                this.F.b(j2);
            }
            InterfaceC10013ub0 interfaceC10013ub0 = this.V;
            if (interfaceC10013ub0 != null) {
                interfaceC10013ub0.close();
                this.V = null;
            }
            if (this.Z != InterfaceC9694tG2.a.ACTIVE_NON_STREAMING) {
                final InterfaceC11231zb0 interfaceC11231zb0 = this.D;
                this.a0 = C5211ay.f().schedule(new Runnable() { // from class: o.gP1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7033iP1.this.d.execute(new Runnable() { // from class: o.bP1
                            @Override // java.lang.Runnable
                            public final void run() {
                                C7033iP1.h(InterfaceC11231zb0.this);
                            }
                        });
                    }
                }, 1000L, TimeUnit.MILLISECONDS);
            } else {
                T(this.D);
            }
            this.D.b(j2);
        }
    }

    public Executor E() {
        return this.b;
    }

    public AbstractC10461wP1 F() {
        return AbstractC10461wP1.d(this.K, this.J, AbstractC3142Hh.g(K(this.H), this.X, this.e0));
    }

    public final void F0() {
        boolean z;
        XF2 xf2 = this.d0;
        if (xf2 != null) {
            if (xf2.m() == this.D) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.n(z);
            C7433k41.a(g0, "Releasing video encoder: " + this.D);
            this.d0.r();
            this.d0 = null;
            this.D = null;
            this.E = null;
            s0(null);
            return;
        }
        p0();
    }

    public <T> T G(AbstractC11237zc2<T> abstractC11237zc2) {
        try {
            return abstractC11237zc2.a().get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void G0() {
        int i2;
        boolean z;
        k kVar;
        boolean z2;
        k kVar2;
        Exception exc;
        synchronized (this.g) {
            try {
                int i3 = h.a[this.i.ordinal()];
                i2 = 4;
                z = false;
                kVar = null;
                if (i3 != 3) {
                    if (i3 != 4) {
                        i2 = 0;
                        exc = null;
                        kVar2 = exc;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = true;
                }
                if (this.l == null && !this.b0) {
                    if (this.Z == InterfaceC9694tG2.a.INACTIVE) {
                        kVar2 = this.m;
                        this.m = null;
                        m0();
                        z = z2;
                        exc = n0;
                    } else if (this.D != null) {
                        i2 = 0;
                        z = z2;
                        exc = null;
                        kVar = Q(this.i);
                        kVar2 = exc;
                    }
                }
                i2 = 0;
                kVar2 = null;
                z = z2;
                exc = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kVar != null) {
            B0(kVar, z);
        } else if (kVar2 != null) {
            A(kVar2, i2, exc);
        }
    }

    public C6276fL1 H() {
        return ((AbstractC3242Ih1) G(this.B)).d().e();
    }

    public final void H0(final k kVar, boolean z) {
        if (!this.t.isEmpty()) {
            InterfaceFutureC8411o11 c2 = C7221jC0.c(this.t);
            if (!c2.isDone()) {
                c2.cancel(true);
            }
            this.t.clear();
        }
        this.t.add(C3679Mt.a(new C3679Mt.c() { // from class: o.RO1
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C7033iP1.t(C7033iP1.this, kVar, aVar);
            }
        }));
        if (M() && !z) {
            this.t.add(C3679Mt.a(new C3679Mt.c() { // from class: o.SO1
                @Override // o.C3679Mt.c
                public final Object a(C3679Mt.a aVar) {
                    return C7033iP1.u(C7033iP1.this, kVar, aVar);
                }
            }));
        }
        C7221jC0.b(C7221jC0.c(this.t), new g(), C5211ay.b());
    }

    public int I() {
        return ((AbstractC3242Ih1) G(this.B)).d().c().getLower().intValue();
    }

    public void I0() {
        k kVar = this.f769o;
        if (kVar != null) {
            kVar.A(CG2.h(kVar.q(), F()));
        }
    }

    public final void J0(l lVar) {
        if (h0.contains(this.i)) {
            if (i0.contains(lVar)) {
                if (this.j != lVar) {
                    this.j = lVar;
                    this.a.j(AbstractC2824Ed2.e(this.k, L(lVar), this.q));
                    return;
                }
                return;
            }
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + lVar);
        }
        throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.i);
    }

    public final int K(i iVar) {
        int i2 = h.b[iVar.ordinal()];
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 != 3) {
            if (i2 == 4 || i2 == 6) {
                return 1;
            }
            throw new AssertionError("Invalid internal audio state: " + iVar);
        }
        k kVar = this.f769o;
        if (kVar != null && kVar.u()) {
            return 5;
        }
        if (this.Y) {
            return 2;
        }
        return 0;
    }

    public void K0(InterfaceC10013ub0 interfaceC10013ub0, k kVar) {
        boolean z;
        long size = this.J + interfaceC10013ub0.size();
        long j2 = this.R;
        if (j2 != 0 && size > j2) {
            C7433k41.a(g0, String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.R)));
            W(kVar, 2, null);
            return;
        }
        long r2 = interfaceC10013ub0.r2();
        long j3 = this.O;
        if (j3 == Long.MAX_VALUE) {
            this.O = r2;
            C7433k41.a(g0, String.format("First audio time: %d (%s)", Long.valueOf(r2), QV.k(this.O)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(r2 - Math.min(this.L, j3));
            if (this.Q != Long.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(r2 - this.Q);
            long j4 = this.S;
            if (j4 != 0 && nanos2 > j4) {
                C7433k41.a(g0, String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.S)));
                W(kVar, 9, null);
                return;
            }
        }
        this.A.writeSampleData(this.u.intValue(), interfaceC10013ub0.X(), interfaceC10013ub0.o1());
        this.J = size;
        this.Q = r2;
    }

    public final AbstractC2824Ed2.a L(l lVar) {
        C10968yV c10968yV = (C10968yV) V20.a(C10968yV.class);
        if (lVar != l.RECORDING && (lVar != l.STOPPING || c10968yV != null)) {
            return AbstractC2824Ed2.a.INACTIVE;
        }
        return AbstractC2824Ed2.a.ACTIVE;
    }

    public void L0(InterfaceC10013ub0 interfaceC10013ub0, k kVar) {
        boolean z;
        if (this.v != null) {
            long size = this.J + interfaceC10013ub0.size();
            long j2 = this.R;
            long j3 = 0;
            if (j2 != 0 && size > j2) {
                C7433k41.a(g0, String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.R)));
                W(kVar, 2, null);
                return;
            }
            long r2 = interfaceC10013ub0.r2();
            long j4 = this.L;
            if (j4 == Long.MAX_VALUE) {
                this.L = r2;
                C7433k41.a(g0, String.format("First video time: %d (%s)", Long.valueOf(r2), QV.k(this.L)));
            } else {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                j3 = timeUnit.toNanos(r2 - Math.min(j4, this.O));
                if (this.P != Long.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                C10907yF1.o(z, "There should be a previous data for adjusting the duration.");
                long nanos = timeUnit.toNanos(r2 - this.P) + j3;
                long j5 = this.S;
                if (j5 != 0 && nanos > j5) {
                    C7433k41.a(g0, String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos), Long.valueOf(this.S)));
                    W(kVar, 9, null);
                    return;
                }
            }
            this.A.writeSampleData(this.v.intValue(), interfaceC10013ub0.X(), interfaceC10013ub0.o1());
            this.J = size;
            this.K = j3;
            this.P = r2;
            I0();
            return;
        }
        throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
    }

    public boolean M() {
        if (this.H == i.ENABLED) {
            return true;
        }
        return false;
    }

    public boolean N() {
        if (((AbstractC3242Ih1) G(this.B)).b().c() != 0) {
            return true;
        }
        return false;
    }

    public boolean O() {
        k kVar = this.f769o;
        if (kVar != null && kVar.v()) {
            return true;
        }
        return false;
    }

    public final k Q(l lVar) {
        boolean z;
        if (lVar == l.PENDING_PAUSED) {
            z = true;
        } else if (lVar == l.PENDING_RECORDING) {
            z = false;
        } else {
            throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
        }
        if (this.l == null) {
            k kVar = this.m;
            if (kVar != null) {
                this.l = kVar;
                this.m = null;
                if (z) {
                    t0(l.PAUSED);
                    return kVar;
                }
                t0(l.RECORDING);
                return kVar;
            }
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        throw new AssertionError("Cannot make pending recording active because another recording is already active.");
    }

    public void R(C10215vP1 c10215vP1, final boolean z) {
        final k kVar;
        synchronized (this.g) {
            try {
                if (!P(c10215vP1, this.m) && !P(c10215vP1, this.l)) {
                    C7433k41.a(g0, "mute() called on a recording that is no longer active: " + c10215vP1.f());
                    return;
                }
                if (P(c10215vP1, this.m)) {
                    kVar = this.m;
                } else {
                    kVar = this.l;
                }
                this.d.execute(new Runnable() { // from class: o.XO1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7033iP1.this.S(kVar, z);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void S(k kVar, boolean z) {
        C2837Eh c2837Eh;
        if (kVar.u() != z) {
            kVar.x(z);
            if (this.f769o == kVar && !this.p && (c2837Eh = this.C) != null) {
                c2837Eh.r(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0003, B:5:0x0010, B:31:0x008a, B:7:0x0014, B:10:0x001f, B:11:0x0025, B:15:0x0030, B:16:0x0037, B:17:0x0038, B:18:0x0050, B:21:0x0054, B:24:0x005c, B:26:0x0062, B:27:0x006e, B:30:0x007d), top: B:47:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void U() {
        k kVar;
        boolean z;
        int i2;
        k kVar2;
        Exception exc;
        int i3;
        synchronized (this.g) {
            try {
                kVar = null;
                switch (h.a[this.i.ordinal()]) {
                    case 1:
                        z = true;
                        C10907yF1.o(O(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i2 = 1;
                        kVar2 = null;
                        exc = null;
                        i3 = 0;
                        break;
                    case 2:
                        z = false;
                        C10907yF1.o(O(), "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording");
                        i2 = 1;
                        kVar2 = null;
                        exc = null;
                        i3 = 0;
                        break;
                    case 3:
                        z = true;
                        if (this.l == null) {
                            kVar2 = null;
                            exc = null;
                            i3 = 0;
                            i2 = i3;
                            break;
                        } else if (this.Z == InterfaceC9694tG2.a.INACTIVE) {
                            kVar2 = this.m;
                            this.m = null;
                            m0();
                            exc = n0;
                            i3 = 4;
                            i2 = 0;
                        } else {
                            exc = null;
                            i3 = 0;
                            i2 = 0;
                            kVar = Q(this.i);
                            kVar2 = null;
                        }
                    case 4:
                        z = false;
                        if (this.l == null) {
                        }
                        break;
                    case 5:
                    case 9:
                        throw new AssertionError("Incorrectly invoke onConfigured() in state " + this.i);
                    case 6:
                        if (!this.h) {
                            throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                        }
                        kVar2 = null;
                        exc = null;
                        z = false;
                        i3 = 0;
                        i2 = i3;
                        break;
                    case 7:
                        t0(l.IDLING);
                        kVar2 = null;
                        exc = null;
                        z = false;
                        i3 = 0;
                        i2 = i3;
                        break;
                    case 8:
                        C7433k41.c(g0, "onConfigured() was invoked when the Recorder had encountered error");
                        kVar2 = null;
                        exc = null;
                        z = false;
                        i3 = 0;
                        i2 = i3;
                        break;
                    default:
                        kVar2 = null;
                        exc = null;
                        z = false;
                        i3 = 0;
                        i2 = i3;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 != 0) {
            H0(this.f769o, true);
            this.D.start();
            if (this.f0) {
                k kVar3 = this.f769o;
                kVar3.A(CG2.f(kVar3.q(), F()));
                this.f0 = false;
            }
            if (z) {
                this.D.pause();
            }
        } else if (kVar != null) {
            B0(kVar, z);
        } else if (kVar2 != null) {
            A(kVar2, i3, exc);
        }
    }

    public void V(Throwable th) {
        k kVar;
        synchronized (this.g) {
            kVar = null;
            switch (h.a[this.i.ordinal()]) {
                case 1:
                case 2:
                case 5:
                case 6:
                case 9:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.i + ": " + th);
                case 3:
                case 4:
                    k kVar2 = this.m;
                    this.m = null;
                    kVar = kVar2;
                case 7:
                    u0(-1);
                    t0(l.ERROR);
                    break;
            }
        }
        if (kVar != null) {
            A(kVar, 7, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #0 {all -> 0x002f, blocks: (B:6:0x0007, B:7:0x0012, B:16:0x003c, B:9:0x0016, B:10:0x002e, B:13:0x0032, B:14:0x0038, B:20:0x0049, B:21:0x0050), top: B:26:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void W(k kVar, int i2, Throwable th) {
        boolean z;
        if (kVar == this.f769o) {
            synchronized (this.g) {
                try {
                    z = false;
                    switch (h.a[this.i.ordinal()]) {
                        case 1:
                        case 2:
                            t0(l.STOPPING);
                            z = true;
                            if (kVar != this.l) {
                                throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                            }
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            if (kVar != this.l) {
                            }
                            break;
                        case 7:
                        case 8:
                        case 9:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.i);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z) {
                D0(kVar, -1L, i2, th);
                return;
            }
            return;
        }
        throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x001a, B:44:0x009b, B:15:0x002a, B:17:0x0030, B:20:0x0043, B:22:0x0047, B:24:0x004d, B:28:0x0055, B:29:0x005f, B:31:0x0063, B:33:0x0075, B:35:0x0079, B:37:0x007f, B:41:0x0087, B:42:0x0091, B:61:0x00c4, B:62:0x00dc, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x001a, B:44:0x009b, B:15:0x002a, B:17:0x0030, B:20:0x0043, B:22:0x0047, B:24:0x004d, B:28:0x0055, B:29:0x005f, B:31:0x0063, B:33:0x0075, B:35:0x0079, B:37:0x007f, B:41:0x0087, B:42:0x0091, B:61:0x00c4, B:62:0x00dc, B:63:0x00dd, B:64:0x00e4), top: B:67:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(k kVar) {
        k kVar2;
        boolean z;
        Throwable th;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        k kVar3;
        synchronized (this.g) {
            try {
                if (this.l == kVar) {
                    kVar2 = null;
                    this.l = null;
                    int i3 = h.a[this.i.ordinal()];
                    if (i3 != 9) {
                        boolean z5 = true;
                        z = false;
                        switch (i3) {
                            case 1:
                            case 2:
                            case 6:
                                if (this.h) {
                                    this.z = null;
                                    C3051Gi2 c3051Gi2 = this.w;
                                    if (c3051Gi2 == null || c3051Gi2.s()) {
                                        z5 = false;
                                    }
                                    t0(l.CONFIGURING);
                                    th = null;
                                    z2 = z5;
                                    i2 = 0;
                                    z3 = false;
                                    kVar3 = th;
                                    break;
                                } else {
                                    t0(l.IDLING);
                                    kVar3 = null;
                                    th = null;
                                    z2 = false;
                                    i2 = 0;
                                    z3 = false;
                                }
                                break;
                            case 3:
                                z4 = true;
                                if (this.Z != InterfaceC9694tG2.a.INACTIVE) {
                                    kVar3 = this.m;
                                    this.m = null;
                                    t0(l.CONFIGURING);
                                    th = n0;
                                    i2 = 4;
                                    z3 = z4;
                                    z2 = false;
                                } else {
                                    if (this.h) {
                                        this.z = null;
                                        C3051Gi2 c3051Gi22 = this.w;
                                        if (c3051Gi22 == null || c3051Gi22.s()) {
                                            z5 = false;
                                        }
                                        J0(l.CONFIGURING);
                                        th = null;
                                        z3 = z4;
                                        z2 = z5;
                                        i2 = 0;
                                    } else if (this.D != null) {
                                        th = null;
                                        z3 = z4;
                                        z2 = false;
                                        i2 = 0;
                                        kVar2 = Q(this.i);
                                    } else {
                                        kVar3 = null;
                                        th = null;
                                        z3 = z4;
                                        z2 = false;
                                        i2 = 0;
                                    }
                                    kVar3 = th;
                                }
                                break;
                            case 4:
                                z4 = false;
                                if (this.Z != InterfaceC9694tG2.a.INACTIVE) {
                                }
                                break;
                            case 5:
                                th = null;
                                z2 = false;
                                i2 = 0;
                                z3 = false;
                                z = true;
                                kVar3 = th;
                                break;
                            default:
                                kVar3 = null;
                                th = null;
                                z2 = false;
                                i2 = 0;
                                z3 = false;
                                break;
                        }
                    } else {
                        throw new AssertionError("Unexpected state on finalize of recording: " + this.i);
                    }
                } else {
                    throw new AssertionError("Active recording did not match finalized recording on finalize.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z2) {
            y(this.w, this.x);
        } else if (z) {
            k0();
        } else if (kVar2 != null) {
            if (!this.h) {
                B0(kVar2, z3);
                return;
            }
            throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
        } else if (kVar3 != null) {
            A(kVar3, i2, th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Y() {
        boolean z;
        C3051Gi2 c3051Gi2;
        synchronized (this.g) {
            try {
                switch (h.a[this.i.ordinal()]) {
                    case 1:
                    case 2:
                    case 8:
                        if (O()) {
                            z = false;
                            break;
                        }
                        t0(l.CONFIGURING);
                        z = true;
                        break;
                    case 3:
                    case 4:
                        J0(l.CONFIGURING);
                        z = true;
                        break;
                    case 5:
                    case 6:
                    case 9:
                        t0(l.CONFIGURING);
                        z = true;
                        break;
                    case 7:
                    default:
                        z = true;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b0 = false;
        if (z && (c3051Gi2 = this.w) != null && !c3051Gi2.s()) {
            y(this.w, this.x);
        }
    }

    public void Z(InterfaceC9694tG2.a aVar) {
        ScheduledFuture<?> scheduledFuture;
        InterfaceC11231zb0 interfaceC11231zb0;
        InterfaceC9694tG2.a aVar2 = this.Z;
        this.Z = aVar;
        if (aVar2 != aVar) {
            C7433k41.a(g0, "Video source has transitioned to state: " + aVar);
            if (aVar == InterfaceC9694tG2.a.INACTIVE) {
                if (this.z == null) {
                    j0(4, null, false);
                    return;
                }
                this.b0 = true;
                k kVar = this.f769o;
                if (kVar != null && !kVar.v()) {
                    W(this.f769o, 4, null);
                    return;
                }
                return;
            } else if (aVar == InterfaceC9694tG2.a.ACTIVE_NON_STREAMING && (scheduledFuture = this.a0) != null && scheduledFuture.cancel(false) && (interfaceC11231zb0 = this.D) != null) {
                T(interfaceC11231zb0);
                return;
            } else {
                return;
            }
        }
        C7433k41.a(g0, "Video source transitions to the same state: " + aVar);
    }

    @Override // o.InterfaceC9694tG2
    public void a(C3051Gi2 c3051Gi2) {
        c(c3051Gi2, EnumC5905dp2.UPTIME);
    }

    public final void a0(C3051Gi2 c3051Gi2, EnumC5905dp2 enumC5905dp2) {
        C3051Gi2 c3051Gi22 = this.w;
        if (c3051Gi22 != null && !c3051Gi22.s()) {
            this.w.w();
        }
        this.w = c3051Gi2;
        this.x = enumC5905dp2;
        y(c3051Gi2, enumC5905dp2);
    }

    @Override // o.InterfaceC9694tG2
    public InterfaceC2789Dt1<AbstractC3242Ih1> b() {
        return this.B;
    }

    public void b0(XF2 xf2) {
        InterfaceC11231zb0 m = xf2.m();
        this.D = m;
        this.N = ((NF2) m.d()).f();
        this.M = this.D.h();
        Surface k2 = xf2.k();
        this.z = k2;
        s0(k2);
        xf2.p(this.d, new InterfaceC11231zb0.c.a() { // from class: o.eP1
            @Override // o.InterfaceC11231zb0.c.a
            public final void a(Surface surface) {
                C7033iP1.this.s0(surface);
            }
        });
        C7221jC0.b(xf2.l(), new b(xf2), this.d);
    }

    @Override // o.InterfaceC9694tG2
    public void c(final C3051Gi2 c3051Gi2, final EnumC5905dp2 enumC5905dp2) {
        synchronized (this.g) {
            try {
                C7433k41.a(g0, "Surface is requested in state: " + this.i + ", Current surface: " + this.k);
                if (this.i == l.ERROR) {
                    t0(l.CONFIGURING);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.execute(new Runnable() { // from class: o.TO1
            @Override // java.lang.Runnable
            public final void run() {
                C7033iP1.this.a0(c3051Gi2, enumC5905dp2);
            }
        });
    }

    public void c0(C10215vP1 c10215vP1) {
        synchronized (this.g) {
            try {
                if (!P(c10215vP1, this.m) && !P(c10215vP1, this.l)) {
                    C7433k41.a(g0, "pause() called on a recording that is no longer active: " + c10215vP1.f());
                    return;
                }
                int i2 = h.a[this.i.ordinal()];
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 7 || i2 == 9) {
                            throw new IllegalStateException("Called pause() from invalid state: " + this.i);
                        }
                    } else {
                        t0(l.PENDING_PAUSED);
                    }
                } else {
                    t0(l.PAUSED);
                    final k kVar = this.l;
                    this.d.execute(new Runnable() { // from class: o.dP1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7033iP1.this.d0(kVar);
                        }
                    });
                }
            } finally {
            }
        }
    }

    @Override // o.InterfaceC9694tG2
    public InterfaceC2789Dt1<AbstractC2824Ed2> d() {
        return this.a;
    }

    public final void d0(k kVar) {
        if (this.f769o == kVar && !this.p) {
            if (M()) {
                this.F.pause();
            }
            this.D.pause();
            k kVar2 = this.f769o;
            kVar2.A(CG2.e(kVar2.q(), F()));
        }
    }

    @Override // o.InterfaceC9694tG2
    public void e(final InterfaceC9694tG2.a aVar) {
        this.d.execute(new Runnable() { // from class: o.UO1
            @Override // java.lang.Runnable
            public final void run() {
                C7033iP1.this.Z(aVar);
            }
        });
    }

    public C9677tC1 e0(Context context, C5903dp0 c5903dp0) {
        if (Build.VERSION.SDK_INT >= 26) {
            return h0(context, c5903dp0);
        }
        throw new UnsupportedOperationException("File descriptors as output destinations are not supported on pre-Android O (API 26) devices.");
    }

    @Override // o.InterfaceC9694tG2
    public InterfaceC7235jF2 f(InterfaceC6420fx interfaceC6420fx) {
        return J(interfaceC6420fx);
    }

    public C9677tC1 f0(Context context, C9583sp0 c9583sp0) {
        return h0(context, c9583sp0);
    }

    public C9677tC1 g0(Context context, C3536Lh1 c3536Lh1) {
        return h0(context, c3536Lh1);
    }

    public final C9677tC1 h0(Context context, AbstractC5209ax1 abstractC5209ax1) {
        C10907yF1.m(abstractC5209ax1, "The OutputOptions cannot be null.");
        return new C9677tC1(context, this, abstractC5209ax1);
    }

    public final void i0() {
        C2837Eh c2837Eh = this.C;
        if (c2837Eh != null) {
            this.C = null;
            C7433k41.a(g0, String.format("Releasing audio source: 0x%x", Integer.valueOf(c2837Eh.hashCode())));
            C7221jC0.b(c2837Eh.x(), new c(c2837Eh), C5211ay.b());
            return;
        }
        throw new AssertionError("Cannot release null audio source.");
    }

    public void j0(int i2, Throwable th, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        synchronized (this.g) {
            try {
                z2 = true;
                z3 = false;
                switch (h.a[this.i.ordinal()]) {
                    case 1:
                    case 2:
                        if (this.f769o != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        C10907yF1.o(z4, "In-progress recording shouldn't be null when in state " + this.i);
                        if (this.l == this.f769o) {
                            if (!O()) {
                                t0(l.RESETTING);
                                z3 = true;
                                z2 = false;
                                break;
                            } else {
                                break;
                            }
                        } else {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                    case 3:
                    case 4:
                        J0(l.RESETTING);
                        break;
                    case 5:
                    default:
                        z2 = false;
                        break;
                    case 6:
                        t0(l.RESETTING);
                        z2 = false;
                        break;
                    case 7:
                    case 8:
                    case 9:
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z2) {
            if (z) {
                l0();
            } else {
                k0();
            }
        } else if (z3) {
            D0(this.f769o, -1L, i2, th);
        }
    }

    public final void k0() {
        if (this.F != null) {
            C7433k41.a(g0, "Releasing audio encoder.");
            this.F.g();
            this.F = null;
            this.G = null;
        }
        if (this.C != null) {
            i0();
        }
        q0(i.INITIALIZING);
        l0();
    }

    public final void l0() {
        if (this.D != null) {
            C7433k41.a(g0, "Releasing video encoder.");
            F0();
        }
        Y();
    }

    public final void m0() {
        if (h0.contains(this.i)) {
            t0(this.j);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.i);
    }

    public void n0(C10215vP1 c10215vP1) {
        synchronized (this.g) {
            try {
                if (!P(c10215vP1, this.m) && !P(c10215vP1, this.l)) {
                    C7433k41.a(g0, "resume() called on a recording that is no longer active: " + c10215vP1.f());
                    return;
                }
                int i2 = h.a[this.i.ordinal()];
                if (i2 != 1) {
                    if (i2 != 3) {
                        if (i2 == 7 || i2 == 9) {
                            throw new IllegalStateException("Called resume() from invalid state: " + this.i);
                        }
                    } else {
                        t0(l.PENDING_RECORDING);
                    }
                } else {
                    t0(l.RECORDING);
                    final k kVar = this.l;
                    this.d.execute(new Runnable() { // from class: o.WO1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7033iP1.this.o0(kVar);
                        }
                    });
                }
            } finally {
            }
        }
    }

    public final void o0(k kVar) {
        if (this.f769o == kVar && !this.p) {
            if (M()) {
                this.F.start();
            }
            InterfaceC11231zb0 interfaceC11231zb0 = this.D;
            if (interfaceC11231zb0 != null) {
                interfaceC11231zb0.start();
                k kVar2 = this.f769o;
                kVar2.A(CG2.f(kVar2.q(), F()));
                return;
            }
            this.f0 = true;
        }
    }

    public final InterfaceFutureC8411o11<Void> p0() {
        C7433k41.a(g0, "Try to safely release video encoder: " + this.D);
        return this.c0.q();
    }

    public void q0(i iVar) {
        C7433k41.a(g0, "Transitioning audio state: " + this.H + " --> " + iVar);
        this.H = iVar;
    }

    public void r0(C3051Gi2.h hVar) {
        C7433k41.a(g0, "Update stream transformation info: " + hVar);
        this.q = hVar;
        synchronized (this.g) {
            this.a.j(AbstractC2824Ed2.e(this.k, L(this.i), hVar));
        }
    }

    public void s0(Surface surface) {
        int hashCode;
        if (this.y == surface) {
            return;
        }
        this.y = surface;
        synchronized (this.g) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                hashCode = 0;
            }
            u0(hashCode);
        }
    }

    public void t0(l lVar) {
        if (this.i != lVar) {
            C7433k41.a(g0, "Transitioning Recorder internal state: " + this.i + " --> " + lVar);
            Set<l> set = h0;
            AbstractC2824Ed2.a aVar = null;
            if (set.contains(lVar)) {
                if (!set.contains(this.i)) {
                    if (i0.contains(this.i)) {
                        l lVar2 = this.i;
                        this.j = lVar2;
                        aVar = L(lVar2);
                    } else {
                        throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.i);
                    }
                }
            } else if (this.j != null) {
                this.j = null;
            }
            this.i = lVar;
            if (aVar == null) {
                aVar = L(lVar);
            }
            this.a.j(AbstractC2824Ed2.e(this.k, aVar, this.q));
            return;
        }
        throw new AssertionError("Attempted to transition to state " + lVar + ", but Recorder is already in state " + lVar);
    }

    public final void u0(int i2) {
        if (this.k == i2) {
            return;
        }
        C7433k41.a(g0, "Transitioning streamId: " + this.k + " --> " + i2);
        this.k = i2;
        this.a.j(AbstractC2824Ed2.e(i2, L(this.i), this.q));
    }

    public void v0(k kVar) {
        int g2;
        if (this.A == null) {
            if (M() && this.W.isEmpty()) {
                throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
            }
            InterfaceC10013ub0 interfaceC10013ub0 = this.V;
            if (interfaceC10013ub0 != null) {
                try {
                    this.V = null;
                    List<InterfaceC10013ub0> C = C(interfaceC10013ub0.r2());
                    long size = interfaceC10013ub0.size();
                    for (InterfaceC10013ub0 interfaceC10013ub02 : C) {
                        size += interfaceC10013ub02.size();
                    }
                    long j2 = this.R;
                    if (j2 != 0 && size > j2) {
                        C7433k41.a(g0, String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.R)));
                        W(kVar, 2, null);
                        interfaceC10013ub0.close();
                        return;
                    }
                    try {
                        AbstractC3242Ih1 abstractC3242Ih1 = (AbstractC3242Ih1) G(this.B);
                        if (abstractC3242Ih1.c() == -1) {
                            g2 = E0(this.s, AbstractC3242Ih1.g(l0.c()));
                        } else {
                            g2 = AbstractC3242Ih1.g(abstractC3242Ih1.c());
                        }
                        MediaMuxer z = kVar.z(g2, new InterfaceC10929yL() { // from class: o.fP1
                            @Override // o.InterfaceC10929yL
                            public final void accept(Object obj) {
                                C7033iP1.this.I = (Uri) obj;
                            }
                        });
                        C3051Gi2.h hVar = this.r;
                        if (hVar != null) {
                            r0(hVar);
                            z.setOrientationHint(hVar.c());
                        }
                        Location c2 = kVar.q().c();
                        if (c2 != null) {
                            try {
                                Pair<Double, Double> a2 = AQ.a(c2.getLatitude(), c2.getLongitude());
                                z.setLocation((float) ((Double) a2.first).doubleValue(), (float) ((Double) a2.second).doubleValue());
                            } catch (IllegalArgumentException e2) {
                                z.release();
                                W(kVar, 5, e2);
                                interfaceC10013ub0.close();
                                return;
                            }
                        }
                        this.v = Integer.valueOf(z.addTrack(this.E.a()));
                        if (M()) {
                            this.u = Integer.valueOf(z.addTrack(this.G.a()));
                        }
                        z.start();
                        this.A = z;
                        L0(interfaceC10013ub0, kVar);
                        for (InterfaceC10013ub0 interfaceC10013ub03 : C) {
                            K0(interfaceC10013ub03, kVar);
                        }
                        interfaceC10013ub0.close();
                        return;
                    } catch (IOException e3) {
                        W(kVar, 5, e3);
                        interfaceC10013ub0.close();
                        return;
                    }
                } catch (Throwable th) {
                    if (interfaceC10013ub0 != null) {
                        try {
                            interfaceC10013ub0.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        throw new AssertionError("Unable to set up media muxer when one already exists.");
    }

    public final void w() {
        while (!this.W.isEmpty()) {
            this.W.b();
        }
    }

    public final void w0(k kVar) throws C2946Fh, C8279nT0 {
        AbstractC3242Ih1 abstractC3242Ih1 = (AbstractC3242Ih1) G(this.B);
        AbstractC4796Yg c2 = C2637Cg.c(abstractC3242Ih1, this.s);
        EnumC5905dp2 enumC5905dp2 = EnumC5905dp2.UPTIME;
        AbstractC8328nh d2 = C2637Cg.d(c2, abstractC3242Ih1.b());
        if (this.C != null) {
            i0();
        }
        C2837Eh x0 = x0(kVar, d2);
        this.C = x0;
        C7433k41.a(g0, String.format("Set up new audio source: 0x%x", Integer.valueOf(x0.hashCode())));
        InterfaceC11231zb0 a2 = this.f.a(this.c, C2637Cg.b(c2, enumC5905dp2, d2, abstractC3242Ih1.b()));
        this.F = a2;
        InterfaceC11231zb0.b a3 = a2.a();
        if (a3 instanceof InterfaceC11231zb0.a) {
            this.C.C((InterfaceC11231zb0.a) a3);
            return;
        }
        throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
    }

    public final AbstractC3242Ih1 x(AbstractC3242Ih1 abstractC3242Ih1) {
        AbstractC3242Ih1.a i2 = abstractC3242Ih1.i();
        if (abstractC3242Ih1.d().b() == -1) {
            i2.c(new InterfaceC10929yL() { // from class: o.PO1
                @Override // o.InterfaceC10929yL
                public final void accept(Object obj) {
                    ((QG2.a) obj).b(C7033iP1.k0.b());
                }
            });
        }
        return i2.a();
    }

    public final C2837Eh x0(k kVar, AbstractC8328nh abstractC8328nh) throws C2946Fh {
        return kVar.y(abstractC8328nh, t0);
    }

    public final void y(C3051Gi2 c3051Gi2, EnumC5905dp2 enumC5905dp2) {
        if (c3051Gi2.s()) {
            C7433k41.p(g0, "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        c3051Gi2.u(this.d, new C3051Gi2.i() { // from class: o.cP1
            @Override // o.C3051Gi2.i
            public final void a(C3051Gi2.h hVar) {
                C7033iP1.this.r = hVar;
            }
        });
        Size p = c3051Gi2.p();
        N80 n = c3051Gi2.n();
        InterfaceC7235jF2 J = J(c3051Gi2.l().c());
        C5548cL1 f2 = J.f(p, n);
        C7433k41.a(g0, "Using supported quality of " + f2 + " for surface size " + p);
        if (f2 != C5548cL1.g) {
            VG2 d2 = J.d(f2, n);
            this.s = d2;
            if (d2 == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        y0(c3051Gi2, enumC5905dp2);
    }

    public final void y0(final C3051Gi2 c3051Gi2, final EnumC5905dp2 enumC5905dp2) {
        p0().h4(new Runnable() { // from class: o.VO1
            @Override // java.lang.Runnable
            public final void run() {
                C7033iP1.j(C7033iP1.this, c3051Gi2, enumC5905dp2);
            }
        }, this.d);
    }

    public void z(int i2, Throwable th) {
        CG2.a b2;
        if (this.f769o != null) {
            MediaMuxer mediaMuxer = this.A;
            if (mediaMuxer != null) {
                try {
                    mediaMuxer.stop();
                    this.A.release();
                } catch (IllegalStateException e2) {
                    C7433k41.c(g0, "MediaMuxer failed to stop or release with error: " + e2.getMessage());
                    if (i2 == 0) {
                        i2 = 1;
                    }
                }
                this.A = null;
            } else if (i2 == 0) {
                i2 = 8;
            }
            this.f769o.l(this.I);
            AbstractC5209ax1 q = this.f769o.q();
            AbstractC10461wP1 F = F();
            AbstractC5452bx1 b3 = AbstractC5452bx1.b(this.I);
            k kVar = this.f769o;
            if (i2 == 0) {
                b2 = CG2.a(q, F, b3);
            } else {
                b2 = CG2.b(q, F, b3, i2, th);
            }
            kVar.A(b2);
            k kVar2 = this.f769o;
            this.f769o = null;
            this.p = false;
            this.u = null;
            this.v = null;
            this.t.clear();
            this.I = Uri.EMPTY;
            this.J = 0L;
            this.K = 0L;
            this.L = Long.MAX_VALUE;
            this.O = Long.MAX_VALUE;
            this.P = Long.MAX_VALUE;
            this.Q = Long.MAX_VALUE;
            this.T = 1;
            this.U = null;
            this.X = null;
            this.e0 = 0.0d;
            w();
            r0(null);
            int i3 = h.b[this.H.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 != 3 && i3 != 4) {
                    if (i3 == 5) {
                        throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
                    }
                } else {
                    q0(i.IDLING);
                    this.C.H();
                }
            } else {
                q0(i.INITIALIZING);
            }
            X(kVar2);
            return;
        }
        throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
    }

    public C10215vP1 z0(C9677tC1 c9677tC1) {
        long j2;
        k kVar;
        int i2;
        k kVar2;
        IOException e2;
        boolean z;
        C10907yF1.m(c9677tC1, "The given PendingRecording cannot be null.");
        synchronized (this.g) {
            try {
                j2 = this.n + 1;
                this.n = j2;
                kVar = null;
                i2 = 0;
                switch (h.a[this.i.ordinal()]) {
                    case 1:
                    case 2:
                        kVar2 = this.l;
                        kVar = kVar2;
                        e2 = null;
                        break;
                    case 3:
                    case 4:
                        kVar2 = (k) C10907yF1.l(this.m);
                        kVar = kVar2;
                        e2 = null;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        l lVar = this.i;
                        l lVar2 = l.IDLING;
                        if (lVar == lVar2) {
                            if (this.l == null && this.m == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C10907yF1.o(z, "Expected recorder to be idle but a recording is either pending or in progress.");
                        }
                        try {
                            k n = k.n(c9677tC1, j2);
                            n.t(c9677tC1.b());
                            this.m = n;
                            l lVar3 = this.i;
                            if (lVar3 == lVar2) {
                                t0(l.PENDING_RECORDING);
                                this.d.execute(new Runnable() { // from class: o.ZO1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C7033iP1.this.G0();
                                    }
                                });
                            } else if (lVar3 == l.ERROR) {
                                t0(l.PENDING_RECORDING);
                                this.d.execute(new Runnable() { // from class: o.aP1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C7033iP1.s(C7033iP1.this);
                                    }
                                });
                            } else {
                                t0(l.PENDING_RECORDING);
                            }
                            e2 = null;
                            break;
                        } catch (IOException e3) {
                            e2 = e3;
                            i2 = 5;
                            break;
                        }
                        break;
                    default:
                        e2 = null;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kVar == null) {
            if (i2 != 0) {
                C7433k41.c(g0, "Recording was started when the Recorder had encountered error " + e2);
                A(k.n(c9677tC1, j2), i2, e2);
                return C10215vP1.a(c9677tC1, j2);
            }
            return C10215vP1.d(c9677tC1, j2);
        }
        throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
    }

    /* renamed from: o.iP1$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC2814Eb0 {
        public final /* synthetic */ C3679Mt.a b;
        public final /* synthetic */ k c;

        public d(C3679Mt.a aVar, k kVar) {
            this.b = aVar;
            this.c = kVar;
        }

        @Override // o.InterfaceC2814Eb0
        public void a() {
            this.b.c(null);
        }

        @Override // o.InterfaceC2814Eb0
        public void b(InterfaceC10013ub0 interfaceC10013ub0) {
            boolean z;
            C7033iP1 c7033iP1 = C7033iP1.this;
            if (c7033iP1.A == null) {
                if (!c7033iP1.p) {
                    InterfaceC10013ub0 interfaceC10013ub02 = c7033iP1.V;
                    if (interfaceC10013ub02 != null) {
                        interfaceC10013ub02.close();
                        C7033iP1.this.V = null;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (interfaceC10013ub0.A1()) {
                        C7033iP1 c7033iP12 = C7033iP1.this;
                        c7033iP12.V = interfaceC10013ub0;
                        if (c7033iP12.M() && C7033iP1.this.W.isEmpty()) {
                            if (z) {
                                C7433k41.a(C7033iP1.g0, "Replaced cached video keyframe with newer keyframe.");
                                return;
                            } else {
                                C7433k41.a(C7033iP1.g0, "Cached video keyframe while we wait for first audio sample before starting muxer.");
                                return;
                            }
                        }
                        C7433k41.a(C7033iP1.g0, "Received video keyframe. Starting muxer...");
                        C7033iP1.this.v0(this.c);
                        return;
                    }
                    if (z) {
                        C7433k41.a(C7033iP1.g0, "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                    }
                    C7433k41.a(C7033iP1.g0, "Dropped video data since muxer has not yet started and data is not a keyframe.");
                    C7033iP1.this.D.f();
                    interfaceC10013ub0.close();
                    return;
                }
                C7433k41.a(C7033iP1.g0, "Drop video data since recording is stopping.");
                interfaceC10013ub0.close();
                return;
            }
            try {
                c7033iP1.L0(interfaceC10013ub0, this.c);
                if (interfaceC10013ub0 != null) {
                    interfaceC10013ub0.close();
                }
            } catch (Throwable th) {
                if (interfaceC10013ub0 != null) {
                    try {
                        interfaceC10013ub0.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // o.InterfaceC2814Eb0
        public void c(InterfaceC2897Ew1 interfaceC2897Ew1) {
            C7033iP1.this.E = interfaceC2897Ew1;
        }

        @Override // o.InterfaceC2814Eb0
        public void f(C9035qb0 c9035qb0) {
            this.b.f(c9035qb0);
        }

        @Override // o.InterfaceC2814Eb0
        public void e() {
        }
    }

    /* renamed from: o.iP1$f */
    /* loaded from: classes.dex */
    public class f implements InterfaceC2814Eb0 {
        public final /* synthetic */ C3679Mt.a b;
        public final /* synthetic */ InterfaceC10929yL c;
        public final /* synthetic */ k d;

        public f(C3679Mt.a aVar, InterfaceC10929yL interfaceC10929yL, k kVar) {
            this.b = aVar;
            this.c = interfaceC10929yL;
            this.d = kVar;
        }

        @Override // o.InterfaceC2814Eb0
        public void a() {
            this.b.c(null);
        }

        @Override // o.InterfaceC2814Eb0
        public void b(InterfaceC10013ub0 interfaceC10013ub0) {
            C7033iP1 c7033iP1 = C7033iP1.this;
            if (c7033iP1.H != i.DISABLED) {
                if (c7033iP1.A == null) {
                    if (!c7033iP1.p) {
                        c7033iP1.W.c(new C6647gq(interfaceC10013ub0));
                        if (C7033iP1.this.V != null) {
                            C7433k41.a(C7033iP1.g0, "Received audio data. Starting muxer...");
                            C7033iP1.this.v0(this.d);
                        } else {
                            C7433k41.a(C7033iP1.g0, "Cached audio data while we wait for video keyframe before starting muxer.");
                        }
                    } else {
                        C7433k41.a(C7033iP1.g0, "Drop audio data since recording is stopping.");
                    }
                    interfaceC10013ub0.close();
                    return;
                }
                try {
                    c7033iP1.K0(interfaceC10013ub0, this.d);
                    if (interfaceC10013ub0 != null) {
                        interfaceC10013ub0.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (interfaceC10013ub0 != null) {
                        try {
                            interfaceC10013ub0.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            interfaceC10013ub0.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }

        @Override // o.InterfaceC2814Eb0
        public void c(InterfaceC2897Ew1 interfaceC2897Ew1) {
            C7033iP1.this.G = interfaceC2897Ew1;
        }

        @Override // o.InterfaceC2814Eb0
        public void f(C9035qb0 c9035qb0) {
            if (C7033iP1.this.X == null) {
                this.c.accept(c9035qb0);
            }
        }

        @Override // o.InterfaceC2814Eb0
        public void e() {
        }
    }
}
