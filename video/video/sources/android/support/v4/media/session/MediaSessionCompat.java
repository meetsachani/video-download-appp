package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o.AbstractC7010iJ2;
import o.C10838xy1;
import o.C2435Ae1;
import o.C5388bh1;
import o.C5630ch1;
import o.C7136ir;
import o.InterfaceC5283bF2;

/* loaded from: classes.dex */
public class MediaSessionCompat {
    public static final String A = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    public static final String B = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    public static final String C = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final String D = "android.support.v4.media.session.action.ARGUMENT_RATING";
    public static final String E = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";
    public static final String F = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    public static final String G = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    public static final String H = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    public static final String I = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    public static final String J = "android.support.v4.media.session.TOKEN";
    public static final String K = "android.support.v4.media.session.EXTRA_BINDER";
    public static final String L = "android.support.v4.media.session.SESSION_TOKEN2";
    public static final int M = 320;
    public static final String N = "data_calling_pkg";
    public static final String O = "data_calling_pid";
    public static final String P = "data_calling_uid";
    public static final String Q = "data_extras";
    public static int R = 0;
    public static final String d = "MediaSessionCompat";
    @Deprecated
    public static final int e = 1;
    @Deprecated
    public static final int f = 2;
    public static final int g = 4;
    public static final String h = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final String i = "android.support.v4.media.session.action.SKIP_AD";
    public static final String j = "android.support.v4.media.session.action.FOLLOW";
    public static final String k = "android.support.v4.media.session.action.UNFOLLOW";
    public static final String l = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final String m = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f1o = 1;
    public static final int p = 2;
    public static final String q = "android.support.v4.media.session.action.PLAY_FROM_URI";
    public static final String r = "android.support.v4.media.session.action.PREPARE";
    public static final String s = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    public static final String t = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    public static final String u = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    public static final String v = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    public static final String w = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    public static final String x = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    public static final String y = "android.support.v4.media.session.action.SET_RATING";
    public static final String z = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";
    public final c a;
    public final MediaControllerCompat b;
    public final ArrayList<k> c;

    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        public static final int Y0 = -1;
        public final MediaDescriptionCompat X;
        public final long Y;
        public MediaSession.QueueItem Z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        /* loaded from: classes.dex */
        public static class b {
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            public static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        public static QueueItem a(Object obj) {
            if (obj != null) {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                return new QueueItem(queueItem, MediaDescriptionCompat.a(b.b(queueItem)), b.c(queueItem));
            }
            return null;
        }

        public static List<QueueItem> b(List<?> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a(it.next()));
                }
                return arrayList;
            }
            return null;
        }

        public MediaDescriptionCompat c() {
            return this.X;
        }

        public long d() {
            return this.Y;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Object e() {
            MediaSession.QueueItem queueItem = this.Z;
            if (queueItem == null) {
                MediaSession.QueueItem a2 = b.a((MediaDescription) this.X.f(), this.Y);
                this.Z = a2;
                return a2;
            }
            return queueItem;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.X + ", Id=" + this.Y + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.X.writeToParcel(parcel, i);
            parcel.writeLong(this.Y);
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j != -1) {
                this.X = mediaDescriptionCompat;
                this.Y = j;
                this.Z = queueItem;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }

        public QueueItem(Parcel parcel) {
            this.X = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.Y = parcel.readLong();
        }
    }

    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        public final Object X;
        public final Object Y;
        public InterfaceC5283bF2 Y0;
        public android.support.v4.media.session.b Z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this(obj, null, null);
        }

        public static Token a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(Token.class.getClassLoader());
            android.support.v4.media.session.b O0 = b.AbstractBinderC0005b.O0(C7136ir.a(bundle, MediaSessionCompat.K));
            InterfaceC5283bF2 c = C10838xy1.c(bundle, MediaSessionCompat.L);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.J);
            if (token == null) {
                return null;
            }
            return new Token(token.Y, O0, c);
        }

        public static Token b(Object obj) {
            return c(obj, null);
        }

        public static Token c(Object obj, android.support.v4.media.session.b bVar) {
            if (obj != null) {
                if (obj instanceof MediaSession.Token) {
                    return new Token(obj, bVar);
                }
                throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
            }
            return null;
        }

        public android.support.v4.media.session.b d() {
            android.support.v4.media.session.b bVar;
            synchronized (this.X) {
                bVar = this.Z;
            }
            return bVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public InterfaceC5283bF2 e() {
            InterfaceC5283bF2 interfaceC5283bF2;
            synchronized (this.X) {
                interfaceC5283bF2 = this.Y0;
            }
            return interfaceC5283bF2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.Y;
            if (obj2 == null) {
                if (token.Y == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.Y;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public Object f() {
            return this.Y;
        }

        public void g(android.support.v4.media.session.b bVar) {
            synchronized (this.X) {
                this.Z = bVar;
            }
        }

        public void h(InterfaceC5283bF2 interfaceC5283bF2) {
            synchronized (this.X) {
                this.Y0 = interfaceC5283bF2;
            }
        }

        public int hashCode() {
            Object obj = this.Y;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.J, this);
            synchronized (this.X) {
                try {
                    android.support.v4.media.session.b bVar = this.Z;
                    if (bVar != null) {
                        C7136ir.b(bundle, MediaSessionCompat.K, bVar.asBinder());
                    }
                    InterfaceC5283bF2 interfaceC5283bF2 = this.Y0;
                    if (interfaceC5283bF2 != null) {
                        C10838xy1.e(bundle, MediaSessionCompat.L, interfaceC5283bF2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.Y, i);
        }

        public Token(Object obj, android.support.v4.media.session.b bVar) {
            this(obj, bVar, null);
        }

        public Token(Object obj, android.support.v4.media.session.b bVar, InterfaceC5283bF2 interfaceC5283bF2) {
            this.X = new Object();
            this.Y = obj;
            this.Z = bVar;
            this.Y0 = interfaceC5283bF2;
        }
    }

    /* loaded from: classes.dex */
    public class a extends b {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public boolean c;
        public a e;
        public final Object a = new Object();
        public final MediaSession.Callback b = new C0002b();
        public WeakReference<c> d = new WeakReference<>(null);

        /* loaded from: classes.dex */
        public class a extends Handler {
            public static final int b = 1;

            public a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.a) {
                        cVar = b.this.d.get();
                        bVar = b.this;
                        aVar = bVar.e;
                    }
                    if (cVar != null && bVar == cVar.v() && aVar != null) {
                        cVar.t((C5630ch1.b) message.obj);
                        b.this.a(cVar, aVar);
                        cVar.t(null);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0002b extends MediaSession.Callback {
            public C0002b() {
            }

            public final void a(c cVar) {
                cVar.t(null);
            }

            public final f b() {
                f fVar;
                synchronized (b.this.a) {
                    fVar = (f) b.this.d.get();
                }
                if (fVar != null && b.this == fVar.v()) {
                    return fVar;
                }
                return null;
            }

            public void c(Rating rating, Bundle bundle) {
            }

            public final void d(c cVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String r = cVar.r();
                if (TextUtils.isEmpty(r)) {
                    r = C5630ch1.b.b;
                }
                cVar.t(new C5630ch1.b(r, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                f b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                d(b);
                try {
                    QueueItem queueItem = null;
                    IBinder asBinder = null;
                    queueItem = null;
                    if (str.equals(MediaControllerCompat.e)) {
                        Bundle bundle2 = new Bundle();
                        Token b2 = b.b();
                        android.support.v4.media.session.b d = b2.d();
                        if (d != null) {
                            asBinder = d.asBinder();
                        }
                        C7136ir.b(bundle2, MediaSessionCompat.K, asBinder);
                        C10838xy1.e(bundle2, MediaSessionCompat.L, b2.e());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals(MediaControllerCompat.f)) {
                        b.this.b((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.j));
                    } else if (str.equals(MediaControllerCompat.g)) {
                        b.this.c((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.j), bundle.getInt(MediaControllerCompat.k));
                    } else if (str.equals(MediaControllerCompat.h)) {
                        b.this.q((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.j));
                    } else if (str.equals(MediaControllerCompat.i)) {
                        if (b.h != null) {
                            int i = bundle.getInt(MediaControllerCompat.k, -1);
                            if (i >= 0 && i < b.h.size()) {
                                queueItem = b.h.get(i);
                            }
                            if (queueItem != null) {
                                b.this.q(queueItem.c());
                            }
                        }
                    } else {
                        b.this.d(str, bundle, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                    Log.e(MediaSessionCompat.d, "Could not unparcel the extra data.");
                }
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                f b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                d(b);
                try {
                    if (str.equals(MediaSessionCompat.q)) {
                        Bundle bundle2 = bundle.getBundle(MediaSessionCompat.F);
                        MediaSessionCompat.b(bundle2);
                        b.this.l((Uri) bundle.getParcelable(MediaSessionCompat.C), bundle2);
                    } else if (str.equals(MediaSessionCompat.r)) {
                        b.this.m();
                    } else if (str.equals(MediaSessionCompat.s)) {
                        String string = bundle.getString(MediaSessionCompat.A);
                        Bundle bundle3 = bundle.getBundle(MediaSessionCompat.F);
                        MediaSessionCompat.b(bundle3);
                        b.this.n(string, bundle3);
                    } else if (str.equals(MediaSessionCompat.t)) {
                        String string2 = bundle.getString(MediaSessionCompat.B);
                        Bundle bundle4 = bundle.getBundle(MediaSessionCompat.F);
                        MediaSessionCompat.b(bundle4);
                        b.this.o(string2, bundle4);
                    } else if (str.equals(MediaSessionCompat.u)) {
                        Bundle bundle5 = bundle.getBundle(MediaSessionCompat.F);
                        MediaSessionCompat.b(bundle5);
                        b.this.p((Uri) bundle.getParcelable(MediaSessionCompat.C), bundle5);
                    } else if (str.equals(MediaSessionCompat.v)) {
                        b.this.u(bundle.getBoolean(MediaSessionCompat.G));
                    } else if (str.equals(MediaSessionCompat.w)) {
                        b.this.y(bundle.getInt(MediaSessionCompat.H));
                    } else if (str.equals(MediaSessionCompat.x)) {
                        b.this.z(bundle.getInt(MediaSessionCompat.I));
                    } else if (str.equals(MediaSessionCompat.y)) {
                        Bundle bundle6 = bundle.getBundle(MediaSessionCompat.F);
                        MediaSessionCompat.b(bundle6);
                        b.this.x((RatingCompat) bundle.getParcelable(MediaSessionCompat.D), bundle6);
                    } else if (str.equals(MediaSessionCompat.z)) {
                        b.this.v(bundle.getFloat(MediaSessionCompat.E, 1.0f));
                    } else {
                        b.this.e(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                    Log.e(MediaSessionCompat.d, "Could not unparcel the data.");
                }
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                f b = b();
                if (b == null) {
                    return;
                }
                d(b);
                b.this.f();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                f b = b();
                if (b == null) {
                    return false;
                }
                d(b);
                boolean g = b.this.g(intent);
                a(b);
                if (!g && !super.onMediaButtonEvent(intent)) {
                    return false;
                }
                return true;
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                f b = b();
                if (b == null) {
                    return;
                }
                d(b);
                b.this.h();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                f b = b();
                if (b == null) {
                    return;
                }
                d(b);
                b.this.i();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                f b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                d(b);
                b.this.j(str, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                f b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                d(b);
                b.this.k(str, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                f b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                d(b);
                b.this.l(uri, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                f b = b();
                if (b == null) {
                    return;
                }
                d(b);
                b.this.m();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                f b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                d(b);
                b.this.n(str, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                f b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                d(b);
                b.this.o(str, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                f b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                d(b);
                b.this.p(uri, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                f b = b();
                if (b == null) {
                    return;
                }
                d(b);
                b.this.s();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j) {
                f b = b();
                if (b == null) {
                    return;
                }
                d(b);
                b.this.t(j);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f) {
                f b = b();
                if (b == null) {
                    return;
                }
                d(b);
                b.this.v(f);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                f b = b();
                if (b == null) {
                    return;
                }
                d(b);
                b.this.w(RatingCompat.a(rating));
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                f b = b();
                if (b == null) {
                    return;
                }
                d(b);
                b.this.A();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                f b = b();
                if (b == null) {
                    return;
                }
                d(b);
                b.this.B();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j) {
                f b = b();
                if (b == null) {
                    return;
                }
                d(b);
                b.this.C(j);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                f b = b();
                if (b == null) {
                    return;
                }
                d(b);
                b.this.D();
                a(b);
            }
        }

        public void A() {
        }

        public void B() {
        }

        public void C(long j) {
        }

        public void D() {
        }

        public void E(c cVar, Handler handler) {
            synchronized (this.a) {
                try {
                    this.d = new WeakReference<>(cVar);
                    a aVar = this.e;
                    a aVar2 = null;
                    if (aVar != null) {
                        aVar.removeCallbacksAndMessages(null);
                    }
                    if (cVar != null && handler != null) {
                        aVar2 = new a(handler.getLooper());
                    }
                    this.e = aVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void a(c cVar, Handler handler) {
            long b;
            boolean z;
            boolean z2;
            if (this.c) {
                boolean z3 = false;
                this.c = false;
                handler.removeMessages(1);
                PlaybackStateCompat X = cVar.X();
                if (X == null) {
                    b = 0;
                } else {
                    b = X.b();
                }
                if (X != null && X.s() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if ((516 & b) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((b & 514) != 0) {
                    z3 = true;
                }
                if (z && z3) {
                    h();
                } else if (!z && z2) {
                    i();
                }
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            c cVar;
            a aVar;
            KeyEvent keyEvent;
            long b;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.a) {
                cVar = this.d.get();
                aVar = this.e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C5630ch1.b B = cVar.B();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(cVar, aVar);
                return false;
            }
            if (keyEvent.getRepeatCount() == 0) {
                if (this.c) {
                    aVar.removeMessages(1);
                    this.c = false;
                    PlaybackStateCompat X = cVar.X();
                    if (X == null) {
                        b = 0;
                    } else {
                        b = X.b();
                    }
                    if ((b & 32) != 0) {
                        A();
                    }
                } else {
                    this.c = true;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, B), ViewConfiguration.getDoubleTapTimeout());
                }
            } else {
                a(cVar, aVar);
            }
            return true;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void r(int i) {
        }

        public void s() {
        }

        public void t(long j) {
        }

        public void u(boolean z) {
        }

        public void v(float f) {
        }

        public void w(RatingCompat ratingCompat) {
        }

        public void x(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void y(int i) {
        }

        public void z(int i) {
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void A(AbstractC7010iJ2 abstractC7010iJ2);

        C5630ch1.b B();

        void N0(int i);

        PlaybackStateCompat X();

        Token b();

        void c1(boolean z);

        void g();

        boolean h();

        void i(int i);

        void j(String str, Bundle bundle);

        void k(b bVar, Handler handler);

        void l(CharSequence charSequence);

        void m(MediaMetadataCompat mediaMetadataCompat);

        void n(int i);

        void o(List<QueueItem> list);

        void p(PlaybackStateCompat playbackStateCompat);

        void q(l lVar, Handler handler);

        String r();

        void s(PendingIntent pendingIntent);

        void setExtras(Bundle bundle);

        void t(C5630ch1.b bVar);

        void u(int i);

        void u0(int i);

        b v();

        void w(PendingIntent pendingIntent);

        Object x();

        void y(boolean z);

        Object z();
    }

    /* loaded from: classes.dex */
    public static class d extends j {
        public static boolean I = true;

        /* loaded from: classes.dex */
        public class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            public a() {
            }

            @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
            public void onPlaybackPositionUpdate(long j) {
                d.this.C(18, -1, -1, Long.valueOf(j), null);
            }
        }

        public d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, InterfaceC5283bF2 interfaceC5283bF2, Bundle bundle) {
            super(context, str, componentName, pendingIntent, interfaceC5283bF2, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public void D(PendingIntent pendingIntent, ComponentName componentName) {
            if (I) {
                try {
                    this.i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w(MediaSessionCompat.d, "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    I = false;
                }
            }
            if (!I) {
                super.D(pendingIntent, componentName);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public void P(PlaybackStateCompat playbackStateCompat) {
            long q = playbackStateCompat.q();
            float n = playbackStateCompat.n();
            long m = playbackStateCompat.m();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.s() == 3) {
                long j = 0;
                if (q > 0) {
                    if (m > 0) {
                        j = elapsedRealtime - m;
                        if (n > 0.0f && n != 1.0f) {
                            j = ((float) j) * n;
                        }
                    }
                    q += j;
                }
            }
            this.j.setPlaybackState(e(playbackStateCompat.s()), q, n);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public void R(PendingIntent pendingIntent, ComponentName componentName) {
            if (I) {
                this.i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.R(pendingIntent, componentName);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public int f(long j) {
            int f = super.f(j);
            if ((j & 256) != 0) {
                return f | 256;
            }
            return f;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j, android.support.v4.media.session.MediaSessionCompat.c
        public void k(b bVar, Handler handler) {
            super.k(bVar, handler);
            if (bVar == null) {
                this.j.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.j.setPlaybackPositionUpdateListener(new a());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {

        /* loaded from: classes.dex */
        public class a implements RemoteControlClient.OnMetadataUpdateListener {
            public a() {
            }

            @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
            public void onMetadataUpdate(int i, Object obj) {
                if (i == 268435457 && (obj instanceof Rating)) {
                    e.this.C(19, -1, -1, RatingCompat.a(obj), null);
                }
            }
        }

        public e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, InterfaceC5283bF2 interfaceC5283bF2, Bundle bundle) {
            super(context, str, componentName, pendingIntent, interfaceC5283bF2, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        public RemoteControlClient.MetadataEditor c(Bundle bundle) {
            long b;
            RemoteControlClient.MetadataEditor c = super.c(bundle);
            PlaybackStateCompat playbackStateCompat = this.u;
            if (playbackStateCompat == null) {
                b = 0;
            } else {
                b = playbackStateCompat.b();
            }
            if ((b & 128) != 0) {
                c.addEditableKey(268435457);
            }
            if (bundle != null) {
                if (bundle.containsKey(MediaMetadataCompat.i1)) {
                    c.putLong(8, bundle.getLong(MediaMetadataCompat.i1));
                }
                if (bundle.containsKey(MediaMetadataCompat.t1)) {
                    c.putObject(101, (Object) bundle.getParcelable(MediaMetadataCompat.t1));
                }
                if (bundle.containsKey(MediaMetadataCompat.s1)) {
                    c.putObject(268435457, (Object) bundle.getParcelable(MediaMetadataCompat.s1));
                }
            }
            return c;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.j
        public int f(long j) {
            int f = super.f(j);
            if ((j & 128) != 0) {
                return f | 512;
            }
            return f;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.j, android.support.v4.media.session.MediaSessionCompat.c
        public void k(b bVar, Handler handler) {
            super.k(bVar, handler);
            if (bVar == null) {
                this.j.setMetadataUpdateListener(null);
                return;
            }
            this.j.setMetadataUpdateListener(new a());
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {
        public g(Context context, String str, InterfaceC5283bF2 interfaceC5283bF2, Bundle bundle) {
            super(context, str, interfaceC5283bF2, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.c
        public void n(int i) {
            this.a.setRatingType(i);
        }

        public g(Object obj) {
            super(obj);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public h(Context context, String str, InterfaceC5283bF2 interfaceC5283bF2, Bundle bundle) {
            super(context, str, interfaceC5283bF2, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.c
        public final C5630ch1.b B() {
            MediaSessionManager.RemoteUserInfo currentControllerInfo;
            currentControllerInfo = this.a.getCurrentControllerInfo();
            return new C5630ch1.b(currentControllerInfo);
        }

        public h(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.c
        public void t(C5630ch1.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {
        public i(Context context, String str, InterfaceC5283bF2 interfaceC5283bF2, Bundle bundle) {
            super(context, str, interfaceC5283bF2, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f
        public MediaSession a(Context context, String str, Bundle bundle) {
            return C5388bh1.a(context, str, bundle);
        }

        public i(Object obj) {
            super(obj);
            Bundle sessionInfo;
            sessionInfo = ((MediaSession) obj).getController().getSessionInfo();
            this.d = sessionInfo;
        }
    }

    /* loaded from: classes.dex */
    public static class j implements c {
        public static final int H = 0;
        public int A;
        public int B;
        public Bundle C;
        public int D;
        public int E;
        public AbstractC7010iJ2 F;
        public final Context a;
        public final ComponentName b;
        public final PendingIntent c;
        public final c d;
        public final Token e;
        public final String f;
        public final Bundle g;
        public final String h;
        public final AudioManager i;
        public final RemoteControlClient j;
        public d m;
        public volatile b p;
        public C5630ch1.b q;
        public m r;
        public MediaMetadataCompat t;
        public PlaybackStateCompat u;
        public PendingIntent v;
        public List<QueueItem> w;
        public CharSequence x;
        public int y;
        public boolean z;
        public final Object k = new Object();
        public final RemoteCallbackList<android.support.v4.media.session.a> l = new RemoteCallbackList<>();
        public boolean n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f3o = false;
        public int s = 3;
        public AbstractC7010iJ2.d G = new a();

        /* loaded from: classes.dex */
        public class a extends AbstractC7010iJ2.d {
            public a() {
            }

            @Override // o.AbstractC7010iJ2.d
            public void a(AbstractC7010iJ2 abstractC7010iJ2) {
                if (j.this.F != abstractC7010iJ2) {
                    return;
                }
                j jVar = j.this;
                j.this.O(new ParcelableVolumeInfo(jVar.D, jVar.E, abstractC7010iJ2.c(), abstractC7010iJ2.b(), abstractC7010iJ2.a()));
            }
        }

        /* loaded from: classes.dex */
        public static final class b {
            public final String a;
            public final Bundle b;
            public final ResultReceiver c;

            public b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.a = str;
                this.b = bundle;
                this.c = resultReceiver;
            }
        }

        /* loaded from: classes.dex */
        public class c extends b.AbstractBinderC0005b {
            public c() {
            }

            @Override // android.support.v4.media.session.b
            public void A2(String str, Bundle bundle) throws RemoteException {
                S7(9, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void B3(int i) {
                r4(28, i);
            }

            public void B5(int i, Object obj) {
                j.this.C(i, 0, 0, obj, null);
            }

            @Override // android.support.v4.media.session.b
            public Bundle C0() {
                if (j.this.g == null) {
                    return null;
                }
                return new Bundle(j.this.g);
            }

            @Override // android.support.v4.media.session.b
            public boolean E1() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void E4(android.support.v4.media.session.a aVar) {
                if (j.this.n) {
                    try {
                        aVar.i3();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                j.this.l.register(aVar, new C5630ch1.b(j.this.d(callingUid), callingPid, callingUid));
                synchronized (j.this.k) {
                    try {
                        m mVar = j.this.r;
                        if (mVar != null) {
                            mVar.a(callingPid, callingUid);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // android.support.v4.media.session.b
            public void E6(int i, int i2, String str) {
                j.this.a(i, i2);
            }

            @Override // android.support.v4.media.session.b
            public int G0() {
                return j.this.B;
            }

            @Override // android.support.v4.media.session.b
            public boolean H0() {
                return j.this.z;
            }

            @Override // android.support.v4.media.session.b
            public void H1(Uri uri, Bundle bundle) throws RemoteException {
                S7(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void I2(Uri uri, Bundle bundle) throws RemoteException {
                S7(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void J3(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                ResultReceiver resultReceiver;
                if (resultReceiverWrapper == null) {
                    resultReceiver = null;
                } else {
                    resultReceiver = resultReceiverWrapper.X;
                }
                B5(1, new b(str, bundle, resultReceiver));
            }

            @Override // android.support.v4.media.session.b
            public void J4(RatingCompat ratingCompat) throws RemoteException {
                B5(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.b
            public void N0(int i) throws RemoteException {
                r4(30, i);
            }

            @Override // android.support.v4.media.session.b
            public void O4(int i, int i2, String str) {
                j.this.Q(i, i2);
            }

            @Override // android.support.v4.media.session.b
            public void O5(android.support.v4.media.session.a aVar) {
                j.this.l.unregister(aVar);
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                synchronized (j.this.k) {
                    try {
                        m mVar = j.this.r;
                        if (mVar != null) {
                            mVar.b(callingPid, callingUid);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // android.support.v4.media.session.b
            public void P3() throws RemoteException {
                V3(17);
            }

            @Override // android.support.v4.media.session.b
            public void S0(MediaDescriptionCompat mediaDescriptionCompat) {
                B5(27, mediaDescriptionCompat);
            }

            public void S7(int i, Object obj, Bundle bundle) {
                j.this.C(i, 0, 0, obj, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void T0(MediaDescriptionCompat mediaDescriptionCompat) {
                B5(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent U1() {
                PendingIntent pendingIntent;
                synchronized (j.this.k) {
                    pendingIntent = j.this.v;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.b
            public CharSequence V0() {
                return j.this.x;
            }

            public void V3(int i) {
                j.this.C(i, 0, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat X() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (j.this.k) {
                    j jVar = j.this;
                    playbackStateCompat = jVar.u;
                    mediaMetadataCompat = jVar.t;
                }
                return MediaSessionCompat.j(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.b
            public long Y() {
                long j;
                synchronized (j.this.k) {
                    j = j.this.s;
                }
                return j;
            }

            @Override // android.support.v4.media.session.b
            public void Y0(long j) throws RemoteException {
                B5(18, Long.valueOf(j));
            }

            @Override // android.support.v4.media.session.b
            public boolean Z2(KeyEvent keyEvent) {
                B5(21, keyEvent);
                return true;
            }

            @Override // android.support.v4.media.session.b
            public boolean Z4() {
                return true;
            }

            @Override // android.support.v4.media.session.b
            public void Z5() throws RemoteException {
                V3(16);
            }

            @Override // android.support.v4.media.session.b
            public void b1(float f) throws RemoteException {
                B5(32, Float.valueOf(f));
            }

            @Override // android.support.v4.media.session.b
            public void c1(boolean z) throws RemoteException {
                B5(29, Boolean.valueOf(z));
            }

            @Override // android.support.v4.media.session.b
            public void f3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                S7(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void f5(String str, Bundle bundle) throws RemoteException {
                S7(5, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                Bundle bundle;
                synchronized (j.this.k) {
                    bundle = j.this.C;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.b
            public void h4(long j) {
                B5(11, Long.valueOf(j));
            }

            public void h5(int i, int i2, int i3) {
                j.this.C(i, i2, i3, null, null);
            }

            @Override // android.support.v4.media.session.b
            public String i0() {
                return j.this.h;
            }

            @Override // android.support.v4.media.session.b
            public void i4(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.b
            public String k0() {
                return j.this.f;
            }

            @Override // android.support.v4.media.session.b
            public void k3(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                s7(26, mediaDescriptionCompat, i);
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> l1() {
                List<QueueItem> list;
                synchronized (j.this.k) {
                    list = j.this.w;
                }
                return list;
            }

            @Override // android.support.v4.media.session.b
            public void m0() throws RemoteException {
                V3(3);
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                V3(14);
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat o0() {
                return j.this.t;
            }

            @Override // android.support.v4.media.session.b
            public void pause() throws RemoteException {
                V3(12);
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                V3(15);
            }

            public void r4(int i, int i2) {
                j.this.C(i, i2, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public void s2(String str, Bundle bundle) throws RemoteException {
                S7(4, str, bundle);
            }

            public void s7(int i, Object obj, int i2) {
                j.this.C(i, i2, 0, obj, null);
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                V3(13);
            }

            @Override // android.support.v4.media.session.b
            public void t0() throws RemoteException {
                V3(7);
            }

            @Override // android.support.v4.media.session.b
            public void u0(int i) throws RemoteException {
                r4(23, i);
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo v7() {
                int i;
                int i2;
                int i3;
                int streamMaxVolume;
                int streamVolume;
                int i4;
                int i5;
                synchronized (j.this.k) {
                    try {
                        j jVar = j.this;
                        i = jVar.D;
                        i2 = jVar.E;
                        AbstractC7010iJ2 abstractC7010iJ2 = jVar.F;
                        i3 = 2;
                        if (i == 2) {
                            i3 = abstractC7010iJ2.c();
                            streamMaxVolume = abstractC7010iJ2.b();
                            streamVolume = abstractC7010iJ2.a();
                        } else {
                            streamMaxVolume = jVar.i.getStreamMaxVolume(i2);
                            streamVolume = j.this.i.getStreamVolume(i2);
                        }
                        i4 = streamMaxVolume;
                        i5 = streamVolume;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new ParcelableVolumeInfo(i, i2, i3, i4, i5);
            }

            @Override // android.support.v4.media.session.b
            public int w0() {
                return j.this.A;
            }

            @Override // android.support.v4.media.session.b
            public void w1(String str, Bundle bundle) throws RemoteException {
                S7(20, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public int y0() {
                return j.this.y;
            }

            @Override // android.support.v4.media.session.b
            public void y2(String str, Bundle bundle) throws RemoteException {
                S7(8, str, bundle);
            }
        }

        /* loaded from: classes.dex */
        public class d extends Handler {
            public static final int A = 25;
            public static final int B = 26;
            public static final int C = 27;
            public static final int D = 28;
            public static final int E = 29;
            public static final int F = 30;
            public static final int G = 127;
            public static final int H = 126;
            public static final int b = 1;
            public static final int c = 2;
            public static final int d = 3;
            public static final int e = 4;
            public static final int f = 5;
            public static final int g = 6;
            public static final int h = 7;
            public static final int i = 8;
            public static final int j = 9;
            public static final int k = 10;
            public static final int l = 11;
            public static final int m = 12;
            public static final int n = 13;

            /* renamed from: o  reason: collision with root package name */
            public static final int f4o = 14;
            public static final int p = 15;
            public static final int q = 16;
            public static final int r = 17;
            public static final int s = 18;
            public static final int t = 19;
            public static final int u = 31;
            public static final int v = 32;
            public static final int w = 20;
            public static final int x = 21;
            public static final int y = 22;
            public static final int z = 23;

            public d(Looper looper) {
                super(looper);
            }

            public final void a(KeyEvent keyEvent, b bVar) {
                long b2;
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = j.this.u;
                    if (playbackStateCompat == null) {
                        b2 = 0;
                    } else {
                        b2 = playbackStateCompat.b();
                    }
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79) {
                        if (keyCode != 126) {
                            if (keyCode != 127) {
                                switch (keyCode) {
                                    case 85:
                                        break;
                                    case 86:
                                        if ((b2 & 1) != 0) {
                                            bVar.D();
                                            return;
                                        }
                                        return;
                                    case 87:
                                        if ((b2 & 32) != 0) {
                                            bVar.A();
                                            return;
                                        }
                                        return;
                                    case 88:
                                        if ((b2 & 16) != 0) {
                                            bVar.B();
                                            return;
                                        }
                                        return;
                                    case 89:
                                        if ((b2 & 8) != 0) {
                                            bVar.s();
                                            return;
                                        }
                                        return;
                                    case 90:
                                        if ((b2 & 64) != 0) {
                                            bVar.f();
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } else if ((b2 & 2) != 0) {
                                bVar.h();
                                return;
                            } else {
                                return;
                            }
                        } else if ((b2 & 4) != 0) {
                            bVar.i();
                            return;
                        } else {
                            return;
                        }
                    }
                    Log.w(MediaSessionCompat.d, "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                QueueItem queueItem;
                b bVar = j.this.p;
                if (bVar == null) {
                    return;
                }
                Bundle data = message.getData();
                MediaSessionCompat.b(data);
                j.this.t(new C5630ch1.b(data.getString(MediaSessionCompat.N), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                Bundle bundle = data.getBundle(MediaSessionCompat.Q);
                MediaSessionCompat.b(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            b bVar2 = (b) message.obj;
                            bVar.d(bVar2.a, bVar2.b, bVar2.c);
                            break;
                        case 2:
                            j.this.a(message.arg1, 0);
                            break;
                        case 3:
                            bVar.m();
                            break;
                        case 4:
                            bVar.n((String) message.obj, bundle);
                            break;
                        case 5:
                            bVar.o((String) message.obj, bundle);
                            break;
                        case 6:
                            bVar.p((Uri) message.obj, bundle);
                            break;
                        case 7:
                            bVar.i();
                            break;
                        case 8:
                            bVar.j((String) message.obj, bundle);
                            break;
                        case 9:
                            bVar.k((String) message.obj, bundle);
                            break;
                        case 10:
                            bVar.l((Uri) message.obj, bundle);
                            break;
                        case 11:
                            bVar.C(((Long) message.obj).longValue());
                            break;
                        case 12:
                            bVar.h();
                            break;
                        case 13:
                            bVar.D();
                            break;
                        case 14:
                            bVar.A();
                            break;
                        case 15:
                            bVar.B();
                            break;
                        case 16:
                            bVar.f();
                            break;
                        case 17:
                            bVar.s();
                            break;
                        case 18:
                            bVar.t(((Long) message.obj).longValue());
                            break;
                        case 19:
                            bVar.w((RatingCompat) message.obj);
                            break;
                        case 20:
                            bVar.e((String) message.obj, bundle);
                            break;
                        case 21:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!bVar.g(intent)) {
                                a(keyEvent, bVar);
                                break;
                            }
                            break;
                        case 22:
                            j.this.Q(message.arg1, 0);
                            break;
                        case 23:
                            bVar.y(message.arg1);
                            break;
                        case 25:
                            bVar.b((MediaDescriptionCompat) message.obj);
                            break;
                        case 26:
                            bVar.c((MediaDescriptionCompat) message.obj, message.arg1);
                            break;
                        case 27:
                            bVar.q((MediaDescriptionCompat) message.obj);
                            break;
                        case 28:
                            List<QueueItem> list = j.this.w;
                            if (list != null) {
                                int i2 = message.arg1;
                                if (i2 >= 0 && i2 < list.size()) {
                                    queueItem = j.this.w.get(message.arg1);
                                } else {
                                    queueItem = null;
                                }
                                if (queueItem != null) {
                                    bVar.q(queueItem.c());
                                    break;
                                }
                            }
                            break;
                        case 29:
                            bVar.u(((Boolean) message.obj).booleanValue());
                            break;
                        case 30:
                            bVar.z(message.arg1);
                            break;
                        case 31:
                            bVar.x((RatingCompat) message.obj, bundle);
                            break;
                        case 32:
                            bVar.v(((Float) message.obj).floatValue());
                            break;
                    }
                } finally {
                    j.this.t(null);
                }
            }
        }

        public j(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, InterfaceC5283bF2 interfaceC5283bF2, Bundle bundle) {
            if (componentName != null) {
                this.a = context;
                this.f = context.getPackageName();
                this.g = bundle;
                this.i = (AudioManager) context.getSystemService("audio");
                this.h = str;
                this.b = componentName;
                this.c = pendingIntent;
                c cVar = new c();
                this.d = cVar;
                this.e = new Token(cVar, null, interfaceC5283bF2);
                this.y = 0;
                this.D = 1;
                this.E = 3;
                this.j = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void A(AbstractC7010iJ2 abstractC7010iJ2) {
            if (abstractC7010iJ2 != null) {
                AbstractC7010iJ2 abstractC7010iJ22 = this.F;
                if (abstractC7010iJ22 != null) {
                    abstractC7010iJ22.h(null);
                }
                this.D = 2;
                this.F = abstractC7010iJ2;
                O(new ParcelableVolumeInfo(this.D, this.E, this.F.c(), this.F.b(), this.F.a()));
                abstractC7010iJ2.h(this.G);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public C5630ch1.b B() {
            C5630ch1.b bVar;
            synchronized (this.k) {
                bVar = this.q;
            }
            return bVar;
        }

        public void C(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.k) {
                try {
                    d dVar = this.m;
                    if (dVar != null) {
                        Message obtainMessage = dVar.obtainMessage(i, i2, i3, obj);
                        Bundle bundle2 = new Bundle();
                        int callingUid = Binder.getCallingUid();
                        bundle2.putInt("data_calling_uid", callingUid);
                        bundle2.putString(MediaSessionCompat.N, d(callingUid));
                        int callingPid = Binder.getCallingPid();
                        if (callingPid > 0) {
                            bundle2.putInt("data_calling_pid", callingPid);
                        } else {
                            bundle2.putInt("data_calling_pid", -1);
                        }
                        if (bundle != null) {
                            bundle2.putBundle(MediaSessionCompat.Q, bundle);
                        }
                        obtainMessage.setData(bundle2);
                        obtainMessage.sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void D(PendingIntent pendingIntent, ComponentName componentName) {
            this.i.registerMediaButtonEventReceiver(componentName);
        }

        public final void E(boolean z) {
            synchronized (this.k) {
                for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).h6(z);
                    } catch (RemoteException unused) {
                    }
                }
                this.l.finishBroadcast();
            }
        }

        public final void F(String str, Bundle bundle) {
            synchronized (this.k) {
                for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).onEvent(str, bundle);
                    } catch (RemoteException unused) {
                    }
                }
                this.l.finishBroadcast();
            }
        }

        public final void G(Bundle bundle) {
            synchronized (this.k) {
                for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).t5(bundle);
                    } catch (RemoteException unused) {
                    }
                }
                this.l.finishBroadcast();
            }
        }

        public final void H(MediaMetadataCompat mediaMetadataCompat) {
            synchronized (this.k) {
                for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).l3(mediaMetadataCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.l.finishBroadcast();
            }
        }

        public final void I(List<QueueItem> list) {
            synchronized (this.k) {
                for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).l2(list);
                    } catch (RemoteException unused) {
                    }
                }
                this.l.finishBroadcast();
            }
        }

        public final void J(CharSequence charSequence) {
            synchronized (this.k) {
                for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).C6(charSequence);
                    } catch (RemoteException unused) {
                    }
                }
                this.l.finishBroadcast();
            }
        }

        public final void K(int i) {
            synchronized (this.k) {
                for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).f1(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.l.finishBroadcast();
            }
        }

        public final void L() {
            synchronized (this.k) {
                for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).i3();
                    } catch (RemoteException unused) {
                    }
                }
                this.l.finishBroadcast();
                this.l.kill();
            }
        }

        public final void M(int i) {
            synchronized (this.k) {
                for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).I3(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.l.finishBroadcast();
            }
        }

        public final void N(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.k) {
                for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).O7(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.l.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void N0(int i) {
            if (this.B != i) {
                this.B = i;
                M(i);
            }
        }

        public void O(ParcelableVolumeInfo parcelableVolumeInfo) {
            synchronized (this.k) {
                for (int beginBroadcast = this.l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.l.getBroadcastItem(beginBroadcast).z4(parcelableVolumeInfo);
                    } catch (RemoteException unused) {
                    }
                }
                this.l.finishBroadcast();
            }
        }

        public void P(PlaybackStateCompat playbackStateCompat) {
            this.j.setPlaybackState(e(playbackStateCompat.s()));
        }

        public void Q(int i, int i2) {
            if (this.D == 2) {
                AbstractC7010iJ2 abstractC7010iJ2 = this.F;
                if (abstractC7010iJ2 != null) {
                    abstractC7010iJ2.g(i);
                    return;
                }
                return;
            }
            this.i.setStreamVolume(this.E, i, i2);
        }

        public void R(PendingIntent pendingIntent, ComponentName componentName) {
            this.i.unregisterMediaButtonEventReceiver(componentName);
        }

        public void S() {
            if (this.f3o) {
                D(this.c, this.b);
                this.i.registerRemoteControlClient(this.j);
                m(this.t);
                p(this.u);
                return;
            }
            R(this.c, this.b);
            this.j.setPlaybackState(0);
            this.i.unregisterRemoteControlClient(this.j);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public PlaybackStateCompat X() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.k) {
                playbackStateCompat = this.u;
            }
            return playbackStateCompat;
        }

        public void a(int i, int i2) {
            if (this.D == 2) {
                AbstractC7010iJ2 abstractC7010iJ2 = this.F;
                if (abstractC7010iJ2 != null) {
                    abstractC7010iJ2.f(i);
                    return;
                }
                return;
            }
            this.i.adjustStreamVolume(this.E, i, i2);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Token b() {
            return this.e;
        }

        public RemoteControlClient.MetadataEditor c(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.j.editMetadata(true);
            if (bundle != null) {
                if (bundle.containsKey(MediaMetadataCompat.o1)) {
                    Bitmap bitmap = (Bitmap) bundle.getParcelable(MediaMetadataCompat.o1);
                    if (bitmap != null) {
                        bitmap = bitmap.copy(bitmap.getConfig(), false);
                    }
                    editMetadata.putBitmap(100, bitmap);
                } else if (bundle.containsKey(MediaMetadataCompat.q1)) {
                    Bitmap bitmap2 = (Bitmap) bundle.getParcelable(MediaMetadataCompat.q1);
                    if (bitmap2 != null) {
                        bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                    }
                    editMetadata.putBitmap(100, bitmap2);
                }
                if (bundle.containsKey(MediaMetadataCompat.c1)) {
                    editMetadata.putString(1, bundle.getString(MediaMetadataCompat.c1));
                }
                if (bundle.containsKey(MediaMetadataCompat.n1)) {
                    editMetadata.putString(13, bundle.getString(MediaMetadataCompat.n1));
                }
                if (bundle.containsKey(MediaMetadataCompat.a1)) {
                    editMetadata.putString(2, bundle.getString(MediaMetadataCompat.a1));
                }
                if (bundle.containsKey(MediaMetadataCompat.d1)) {
                    editMetadata.putString(3, bundle.getString(MediaMetadataCompat.d1));
                }
                if (bundle.containsKey(MediaMetadataCompat.g1)) {
                    editMetadata.putString(15, bundle.getString(MediaMetadataCompat.g1));
                }
                if (bundle.containsKey(MediaMetadataCompat.f1)) {
                    editMetadata.putString(4, bundle.getString(MediaMetadataCompat.f1));
                }
                if (bundle.containsKey(MediaMetadataCompat.h1)) {
                    editMetadata.putString(5, bundle.getString(MediaMetadataCompat.h1));
                }
                if (bundle.containsKey(MediaMetadataCompat.m1)) {
                    editMetadata.putLong(14, bundle.getLong(MediaMetadataCompat.m1));
                }
                if (bundle.containsKey(MediaMetadataCompat.b1)) {
                    editMetadata.putLong(9, bundle.getLong(MediaMetadataCompat.b1));
                }
                if (bundle.containsKey(MediaMetadataCompat.j1)) {
                    editMetadata.putString(6, bundle.getString(MediaMetadataCompat.j1));
                }
                if (bundle.containsKey(MediaMetadataCompat.Z0)) {
                    editMetadata.putString(7, bundle.getString(MediaMetadataCompat.Z0));
                }
                if (bundle.containsKey(MediaMetadataCompat.k1)) {
                    editMetadata.putLong(0, bundle.getLong(MediaMetadataCompat.k1));
                }
                if (bundle.containsKey(MediaMetadataCompat.e1)) {
                    editMetadata.putString(11, bundle.getString(MediaMetadataCompat.e1));
                }
            }
            return editMetadata;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void c1(boolean z) {
            if (this.z != z) {
                this.z = z;
                E(z);
            }
        }

        public String d(int i) {
            String nameForUid = this.a.getPackageManager().getNameForUid(i);
            if (TextUtils.isEmpty(nameForUid)) {
                return C5630ch1.b.b;
            }
            return nameForUid;
        }

        public int e(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        public int f(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void g() {
            this.f3o = false;
            this.n = true;
            S();
            L();
            k(null, null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public boolean h() {
            return this.f3o;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void i(int i) {
            synchronized (this.k) {
                this.s = i | 3;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void j(String str, Bundle bundle) {
            F(str, bundle);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[Catch: all -> 0x000c, TryCatch #0 {all -> 0x000c, blocks: (B:4:0x0003, B:6:0x0008, B:12:0x0013, B:14:0x001e, B:16:0x0024, B:18:0x0028, B:19:0x002d, B:21:0x0033, B:22:0x0038), top: B:26:0x0003 }] */
        @Override // android.support.v4.media.session.MediaSessionCompat.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void k(b bVar, Handler handler) {
            d dVar;
            synchronized (this.k) {
                try {
                    d dVar2 = this.m;
                    if (dVar2 != null) {
                        dVar2.removeCallbacksAndMessages(null);
                    }
                    if (bVar != null && handler != null) {
                        dVar = new d(handler.getLooper());
                        this.m = dVar;
                        if (this.p != bVar && this.p != null) {
                            this.p.E(null, null);
                        }
                        this.p = bVar;
                        if (this.p != null) {
                            this.p.E(this, handler);
                        }
                    }
                    dVar = null;
                    this.m = dVar;
                    if (this.p != bVar) {
                        this.p.E(null, null);
                    }
                    this.p = bVar;
                    if (this.p != null) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void l(CharSequence charSequence) {
            this.x = charSequence;
            J(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void m(MediaMetadataCompat mediaMetadataCompat) {
            Bundle d2;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.b(mediaMetadataCompat, MediaSessionCompat.R).a();
            }
            synchronized (this.k) {
                this.t = mediaMetadataCompat;
            }
            H(mediaMetadataCompat);
            if (!this.f3o) {
                return;
            }
            if (mediaMetadataCompat == null) {
                d2 = null;
            } else {
                d2 = mediaMetadataCompat.d();
            }
            c(d2).apply();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void n(int i) {
            this.y = i;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void o(List<QueueItem> list) {
            this.w = list;
            I(list);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void p(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.k) {
                this.u = playbackStateCompat;
            }
            N(playbackStateCompat);
            if (!this.f3o) {
                return;
            }
            if (playbackStateCompat == null) {
                this.j.setPlaybackState(0);
                this.j.setTransportControlFlags(0);
                return;
            }
            P(playbackStateCompat);
            this.j.setTransportControlFlags(f(playbackStateCompat.b()));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void q(l lVar, Handler handler) {
            synchronized (this.k) {
                try {
                    m mVar = this.r;
                    if (mVar != null) {
                        mVar.removeCallbacksAndMessages(null);
                    }
                    if (lVar != null) {
                        this.r = new m(handler.getLooper(), lVar);
                    } else {
                        this.r = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public String r() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void s(PendingIntent pendingIntent) {
            synchronized (this.k) {
                this.v = pendingIntent;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void setExtras(Bundle bundle) {
            this.C = bundle;
            G(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void t(C5630ch1.b bVar) {
            synchronized (this.k) {
                this.q = bVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void u(int i) {
            AbstractC7010iJ2 abstractC7010iJ2 = this.F;
            if (abstractC7010iJ2 != null) {
                abstractC7010iJ2.h(null);
            }
            this.E = i;
            this.D = 1;
            int i2 = this.D;
            int i3 = this.E;
            O(new ParcelableVolumeInfo(i2, i3, 2, this.i.getStreamMaxVolume(i3), this.i.getStreamVolume(this.E)));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void u0(int i) {
            if (this.A != i) {
                this.A = i;
                K(i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b v() {
            b bVar;
            synchronized (this.k) {
                bVar = this.p;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void w(PendingIntent pendingIntent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object x() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void y(boolean z) {
            if (z == this.f3o) {
                return;
            }
            this.f3o = z;
            S();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object z() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a();
    }

    /* loaded from: classes.dex */
    public interface l {
        void a(int i, int i2);

        void b(int i, int i2);
    }

    /* loaded from: classes.dex */
    public static final class m extends Handler {
        public static final int b = 1001;
        public static final int c = 1002;
        public final l a;

        public m(Looper looper, l lVar) {
            super(looper);
            this.a = lVar;
        }

        public void a(int i, int i2) {
            obtainMessage(1001, i, i2).sendToTarget();
        }

        public void b(int i, int i2) {
            obtainMessage(1002, i, i2).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i != 1001) {
                if (i != 1002) {
                    return;
                }
                this.a.b(message.arg1, message.arg2);
                return;
            }
            this.a.a(message.arg1, message.arg2);
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public static Bundle G(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        b(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e(d, "Could not unparcel the data.");
            return null;
        }
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat c(Context context, Object obj) {
        c fVar;
        int i2 = Build.VERSION.SDK_INT;
        if (context != null && obj != null) {
            if (i2 >= 29) {
                fVar = new i(obj);
            } else if (i2 >= 28) {
                fVar = new h(obj);
            } else {
                fVar = new f(obj);
            }
            return new MediaSessionCompat(context, fVar);
        }
        return null;
    }

    public static PlaybackStateCompat j(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long m2;
        long j2;
        if (playbackStateCompat != null) {
            long j3 = -1;
            if (playbackStateCompat.q() != -1) {
                if (playbackStateCompat.s() == 3 || playbackStateCompat.s() == 4 || playbackStateCompat.s() == 5) {
                    if (playbackStateCompat.m() > 0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long n2 = (playbackStateCompat.n() * ((float) (elapsedRealtime - m2))) + playbackStateCompat.q();
                        if (mediaMetadataCompat != null && mediaMetadataCompat.a(MediaMetadataCompat.b1)) {
                            j3 = mediaMetadataCompat.f(MediaMetadataCompat.b1);
                        }
                        if (j3 >= 0 && n2 > j3) {
                            j2 = j3;
                        } else if (n2 < 0) {
                            j2 = 0;
                        } else {
                            j2 = n2;
                        }
                        return new PlaybackStateCompat.e(playbackStateCompat).k(playbackStateCompat.s(), j2, playbackStateCompat.n(), elapsedRealtime).c();
                    }
                    return playbackStateCompat;
                }
                return playbackStateCompat;
            }
            return playbackStateCompat;
        }
        return playbackStateCompat;
    }

    public void A(CharSequence charSequence) {
        this.a.l(charSequence);
    }

    public void B(int i2) {
        this.a.n(i2);
    }

    public void C(l lVar, Handler handler) {
        this.a.q(lVar, handler);
    }

    public void D(int i2) {
        this.a.u0(i2);
    }

    public void E(PendingIntent pendingIntent) {
        this.a.s(pendingIntent);
    }

    public void F(int i2) {
        this.a.N0(i2);
    }

    public void a(k kVar) {
        if (kVar != null) {
            this.c.add(kVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public String d() {
        return this.a.r();
    }

    public MediaControllerCompat e() {
        return this.b;
    }

    public final C5630ch1.b f() {
        return this.a.B();
    }

    public Object g() {
        return this.a.z();
    }

    public Object h() {
        return this.a.x();
    }

    public Token i() {
        return this.a.b();
    }

    public boolean k() {
        return this.a.h();
    }

    public void l() {
        this.a.g();
    }

    public void m(k kVar) {
        if (kVar != null) {
            this.c.remove(kVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public void n(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.a.j(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public void o(boolean z2) {
        this.a.y(z2);
        Iterator<k> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void p(b bVar) {
        q(bVar, null);
    }

    public void q(b bVar, Handler handler) {
        if (bVar == null) {
            this.a.k(null, null);
            return;
        }
        c cVar = this.a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.k(bVar, handler);
    }

    public void r(boolean z2) {
        this.a.c1(z2);
    }

    public void s(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    public void t(int i2) {
        this.a.i(i2);
    }

    public void u(PendingIntent pendingIntent) {
        this.a.w(pendingIntent);
    }

    public void v(MediaMetadataCompat mediaMetadataCompat) {
        this.a.m(mediaMetadataCompat);
    }

    public void w(PlaybackStateCompat playbackStateCompat) {
        this.a.p(playbackStateCompat);
    }

    public void x(int i2) {
        this.a.u(i2);
    }

    public void y(AbstractC7010iJ2 abstractC7010iJ2) {
        if (abstractC7010iJ2 != null) {
            this.a.A(abstractC7010iJ2);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void z(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem != null) {
                    if (hashSet.contains(Long.valueOf(queueItem.d()))) {
                        Log.e(d, "Found duplicate queue id: " + queueItem.d(), new IllegalArgumentException("id of each queue item should be unique"));
                    }
                    hashSet.add(Long.valueOf(queueItem.d()));
                } else {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
            }
        }
        this.a.o(list);
    }

    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        public ResultReceiver X;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.X = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.X.writeToParcel(parcel, i);
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.X = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, InterfaceC5283bF2 interfaceC5283bF2) {
        this.c = new ArrayList<>();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null && (componentName = C2435Ae1.c(context)) == null) {
                    Log.w(d, "Couldn't find a unique registered media button receiver in the given context.");
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    this.a = new i(context, str, interfaceC5283bF2, bundle);
                } else if (i2 >= 28) {
                    this.a = new h(context, str, interfaceC5283bF2, bundle);
                } else {
                    this.a = new g(context, str, interfaceC5283bF2, bundle);
                }
                q(new a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.a.w(pendingIntent);
                this.b = new MediaControllerCompat(context, this);
                if (R == 0) {
                    R = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    /* loaded from: classes.dex */
    public static class f implements c {
        public final MediaSession a;
        public final Token b;
        public Bundle d;
        public PlaybackStateCompat g;
        public List<QueueItem> h;
        public MediaMetadataCompat i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public b n;

        /* renamed from: o  reason: collision with root package name */
        public m f2o;
        public C5630ch1.b p;
        public final Object c = new Object();
        public boolean e = false;
        public final RemoteCallbackList<android.support.v4.media.session.a> f = new RemoteCallbackList<>();

        /* loaded from: classes.dex */
        public class a extends b.AbstractBinderC0005b {
            public a() {
            }

            @Override // android.support.v4.media.session.b
            public void A2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void B3(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle C0() {
                if (f.this.d == null) {
                    return null;
                }
                return new Bundle(f.this.d);
            }

            @Override // android.support.v4.media.session.b
            public boolean E1() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void E4(android.support.v4.media.session.a aVar) {
                if (f.this.e) {
                    return;
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                f.this.f.register(aVar, new C5630ch1.b(C5630ch1.b.b, callingPid, callingUid));
                synchronized (f.this.c) {
                    try {
                        m mVar = f.this.f2o;
                        if (mVar != null) {
                            mVar.a(callingPid, callingUid);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // android.support.v4.media.session.b
            public void E6(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int G0() {
                return f.this.m;
            }

            @Override // android.support.v4.media.session.b
            public boolean H0() {
                return f.this.k;
            }

            @Override // android.support.v4.media.session.b
            public void H1(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void I2(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void J3(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void J4(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void N0(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void O4(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void O5(android.support.v4.media.session.a aVar) {
                f.this.f.unregister(aVar);
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                synchronized (f.this.c) {
                    try {
                        m mVar = f.this.f2o;
                        if (mVar != null) {
                            mVar.b(callingPid, callingUid);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // android.support.v4.media.session.b
            public void P3() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void S0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void T0(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent U1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public CharSequence V0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat X() {
                f fVar = f.this;
                return MediaSessionCompat.j(fVar.g, fVar.i);
            }

            @Override // android.support.v4.media.session.b
            public long Y() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Y0(long j) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean Z2(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean Z4() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Z5() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void b1(float f) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void c1(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void f3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void f5(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void h4(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String i0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void i4(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.b
            public String k0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void k3(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> l1() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void m0() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat o0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void s2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void t0() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void u0(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo v7() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int w0() {
                return f.this.l;
            }

            @Override // android.support.v4.media.session.b
            public void w1(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int y0() {
                return f.this.j;
            }

            @Override // android.support.v4.media.session.b
            public void y2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
        }

        public f(Context context, String str, InterfaceC5283bF2 interfaceC5283bF2, Bundle bundle) {
            MediaSession a2 = a(context, str, bundle);
            this.a = a2;
            this.b = new Token(a2.getSessionToken(), new a(), interfaceC5283bF2);
            this.d = bundle;
            i(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void A(AbstractC7010iJ2 abstractC7010iJ2) {
            this.a.setPlaybackToRemote((VolumeProvider) abstractC7010iJ2.e());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public C5630ch1.b B() {
            C5630ch1.b bVar;
            synchronized (this.c) {
                bVar = this.p;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void N0(int i) {
            if (this.m != i) {
                this.m = i;
                synchronized (this.c) {
                    for (int beginBroadcast = this.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.f.getBroadcastItem(beginBroadcast).I3(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public PlaybackStateCompat X() {
            return this.g;
        }

        public MediaSession a(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Token b() {
            return this.b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void c1(boolean z) {
            if (this.k != z) {
                this.k = z;
                synchronized (this.c) {
                    for (int beginBroadcast = this.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.f.getBroadcastItem(beginBroadcast).h6(z);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void g() {
            this.e = true;
            this.f.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e) {
                    Log.w(MediaSessionCompat.d, "Exception happened while accessing MediaSession.mCallback.", e);
                }
            }
            this.a.setCallback(null);
            this.a.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public boolean h() {
            return this.a.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void i(int i) {
            this.a.setFlags(i | 3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void j(String str, Bundle bundle) {
            this.a.sendSessionEvent(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void k(b bVar, Handler handler) {
            MediaSession.Callback callback;
            synchronized (this.c) {
                try {
                    this.n = bVar;
                    MediaSession mediaSession = this.a;
                    if (bVar == null) {
                        callback = null;
                    } else {
                        callback = bVar.b;
                    }
                    mediaSession.setCallback(callback, handler);
                    if (bVar != null) {
                        bVar.E(this, handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void l(CharSequence charSequence) {
            this.a.setQueueTitle(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void m(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.i = mediaMetadataCompat;
            MediaSession mediaSession = this.a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = (MediaMetadata) mediaMetadataCompat.g();
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void n(int i) {
            this.j = i;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void o(List<QueueItem> list) {
            this.h = list;
            if (list == null) {
                this.a.setQueue(null);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (QueueItem queueItem : list) {
                arrayList.add((MediaSession.QueueItem) queueItem.e());
            }
            this.a.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void p(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.g = playbackStateCompat;
            synchronized (this.c) {
                for (int beginBroadcast = this.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f.getBroadcastItem(beginBroadcast).O7(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f.finishBroadcast();
            }
            MediaSession mediaSession = this.a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                playbackState = (PlaybackState) playbackStateCompat.o();
            }
            mediaSession.setPlaybackState(playbackState);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void q(l lVar, Handler handler) {
            synchronized (this.c) {
                try {
                    m mVar = this.f2o;
                    if (mVar != null) {
                        mVar.removeCallbacksAndMessages(null);
                    }
                    if (lVar != null) {
                        this.f2o = new m(handler.getLooper(), lVar);
                    } else {
                        this.f2o = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public String r() {
            try {
                return (String) this.a.getClass().getMethod("getCallingPackage", null).invoke(this.a, null);
            } catch (Exception e) {
                Log.e(MediaSessionCompat.d, "Cannot execute MediaSession.getCallingPackage()", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void s(PendingIntent pendingIntent) {
            this.a.setSessionActivity(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void t(C5630ch1.b bVar) {
            synchronized (this.c) {
                this.p = bVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void u(int i) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            this.a.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void u0(int i) {
            if (this.l != i) {
                this.l = i;
                synchronized (this.c) {
                    for (int beginBroadcast = this.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.f.getBroadcastItem(beginBroadcast).f1(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b v() {
            b bVar;
            synchronized (this.c) {
                bVar = this.n;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void w(PendingIntent pendingIntent) {
            this.a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object x() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void y(boolean z) {
            this.a.setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Object z() {
            return this.a;
        }

        public f(Object obj) {
            if (obj instanceof MediaSession) {
                MediaSession mediaSession = (MediaSession) obj;
                this.a = mediaSession;
                this.b = new Token(mediaSession.getSessionToken(), new a());
                this.d = null;
                i(3);
                return;
            }
            throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
        }
    }

    public MediaSessionCompat(Context context, c cVar) {
        this.c = new ArrayList<>();
        this.a = cVar;
        this.b = new MediaControllerCompat(context, this);
    }
}
