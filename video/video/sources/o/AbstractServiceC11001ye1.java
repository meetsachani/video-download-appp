package o;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.C5630ch1;

/* renamed from: o.ye1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC11001ye1 extends Service {
    public static final String c1 = "MBServiceCompat";
    public static final boolean d1 = Log.isLoggable(c1, 3);
    public static final float e1 = 1.0E-5f;
    public static final String f1 = "android.media.browse.MediaBrowserService";
    public static final String g1 = "media_item";
    public static final String h1 = "search_results";
    public static final int i1 = 1;
    public static final int j1 = 2;
    public static final int k1 = 4;
    public static final int l1 = -1;
    public static final int m1 = 0;
    public static final int n1 = 1;
    public g X;
    public f Z0;
    public MediaSessionCompat.Token b1;
    public final f Y = new f(C5630ch1.b.b, -1, -1, null, null);
    public final ArrayList<f> Z = new ArrayList<>();
    public final C2531Be<IBinder, f> Y0 = new C2531Be<>();
    public final r a1 = new r();

    /* renamed from: o.ye1$a */
    /* loaded from: classes.dex */
    public class a extends m<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ f f;
        public final /* synthetic */ String g;
        public final /* synthetic */ Bundle h;
        public final /* synthetic */ Bundle i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f = fVar;
            this.g = str;
            this.h = bundle;
            this.i = bundle2;
        }

        @Override // o.AbstractServiceC11001ye1.m
        /* renamed from: l */
        public void g(List<MediaBrowserCompat.MediaItem> list) {
            if (AbstractServiceC11001ye1.this.Y0.get(this.f.f.asBinder()) != this.f) {
                if (AbstractServiceC11001ye1.d1) {
                    Log.d(AbstractServiceC11001ye1.c1, "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f.a + " id=" + this.g);
                    return;
                }
                return;
            }
            if ((c() & 1) != 0) {
                list = AbstractServiceC11001ye1.this.b(list, this.h);
            }
            try {
                this.f.f.a(this.g, list, this.h, this.i);
            } catch (RemoteException unused) {
                Log.w(AbstractServiceC11001ye1.c1, "Calling onLoadChildren() failed for id=" + this.g + " package=" + this.f.a);
            }
        }
    }

    /* renamed from: o.ye1$b */
    /* loaded from: classes.dex */
    public class b extends m<MediaBrowserCompat.MediaItem> {
        public final /* synthetic */ XT1 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, XT1 xt1) {
            super(obj);
            this.f = xt1;
        }

        @Override // o.AbstractServiceC11001ye1.m
        /* renamed from: l */
        public void g(MediaBrowserCompat.MediaItem mediaItem) {
            if ((c() & 2) != 0) {
                this.f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(AbstractServiceC11001ye1.g1, mediaItem);
            this.f.b(0, bundle);
        }
    }

    /* renamed from: o.ye1$c */
    /* loaded from: classes.dex */
    public class c extends m<List<MediaBrowserCompat.MediaItem>> {
        public final /* synthetic */ XT1 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, XT1 xt1) {
            super(obj);
            this.f = xt1;
        }

        @Override // o.AbstractServiceC11001ye1.m
        /* renamed from: l */
        public void g(List<MediaBrowserCompat.MediaItem> list) {
            if ((c() & 4) == 0 && list != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArray(AbstractServiceC11001ye1.h1, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                this.f.b(0, bundle);
                return;
            }
            this.f.b(-1, null);
        }
    }

    /* renamed from: o.ye1$d */
    /* loaded from: classes.dex */
    public class d extends m<Bundle> {
        public final /* synthetic */ XT1 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, XT1 xt1) {
            super(obj);
            this.f = xt1;
        }

        @Override // o.AbstractServiceC11001ye1.m
        public void e(Bundle bundle) {
            this.f.b(-1, bundle);
        }

        @Override // o.AbstractServiceC11001ye1.m
        public void f(Bundle bundle) {
            this.f.b(1, bundle);
        }

        @Override // o.AbstractServiceC11001ye1.m
        /* renamed from: l */
        public void g(Bundle bundle) {
            this.f.b(0, bundle);
        }
    }

    /* renamed from: o.ye1$e */
    /* loaded from: classes.dex */
    public static final class e {
        public static final String c = "android.service.media.extra.RECENT";
        public static final String d = "android.service.media.extra.OFFLINE";
        public static final String e = "android.service.media.extra.SUGGESTED";
        @Deprecated
        public static final String f = "android.service.media.extra.SUGGESTION_KEYWORDS";
        public final String a;
        public final Bundle b;

        public e(String str, Bundle bundle) {
            if (str != null) {
                this.a = str;
                this.b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }

        public Bundle c() {
            return this.b;
        }

        public String d() {
            return this.a;
        }
    }

    /* renamed from: o.ye1$f */
    /* loaded from: classes.dex */
    public class f implements IBinder.DeathRecipient {
        public final String a;
        public final int b;
        public final int c;
        public final C5630ch1.b d;
        public final Bundle e;
        public final p f;
        public final HashMap<String, List<C4377Tx1<IBinder, Bundle>>> g = new HashMap<>();
        public e h;

        /* renamed from: o.ye1$f$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                AbstractServiceC11001ye1.this.Y0.remove(fVar.f.asBinder());
            }
        }

        public f(String str, int i, int i2, Bundle bundle, p pVar) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = new C5630ch1.b(str, i, i2);
            this.e = bundle;
            this.f = pVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            AbstractServiceC11001ye1.this.a1.post(new a());
        }
    }

    /* renamed from: o.ye1$g */
    /* loaded from: classes.dex */
    public interface g {
        void a(C5630ch1.b bVar, String str, Bundle bundle);

        C5630ch1.b b();

        void c(String str, Bundle bundle);

        void d(MediaSessionCompat.Token token);

        Bundle e();

        IBinder onBind(Intent intent);

        void onCreate();
    }

    /* renamed from: o.ye1$h */
    /* loaded from: classes.dex */
    public class h implements g {
        public final List<Bundle> a = new ArrayList();
        public MediaBrowserService b;
        public Messenger c;

        /* renamed from: o.ye1$h$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ MediaSessionCompat.Token X;

            public a(MediaSessionCompat.Token token) {
                this.X = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.l(this.X);
            }
        }

        /* renamed from: o.ye1$h$b */
        /* loaded from: classes.dex */
        public class b extends m<List<MediaBrowserCompat.MediaItem>> {
            public final /* synthetic */ n f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Object obj, n nVar) {
                super(obj);
                this.f = nVar;
            }

            @Override // o.AbstractServiceC11001ye1.m
            public void b() {
                this.f.a();
            }

            @Override // o.AbstractServiceC11001ye1.m
            /* renamed from: l */
            public void g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f.c(arrayList);
            }
        }

        /* renamed from: o.ye1$h$c */
        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ String X;
            public final /* synthetic */ Bundle Y;

            public c(String str, Bundle bundle) {
                this.X = str;
                this.Y = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (IBinder iBinder : AbstractServiceC11001ye1.this.Y0.keySet()) {
                    C2531Be<IBinder, f> c2531Be = AbstractServiceC11001ye1.this.Y0;
                    h.this.h(c2531Be.get(iBinder), this.X, this.Y);
                }
            }
        }

        /* renamed from: o.ye1$h$d */
        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ C5630ch1.b X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ Bundle Z;

            public d(C5630ch1.b bVar, String str, Bundle bundle) {
                this.X = bVar;
                this.Y = str;
                this.Z = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < AbstractServiceC11001ye1.this.Y0.size(); i++) {
                    f l = AbstractServiceC11001ye1.this.Y0.l(i);
                    if (l.d.equals(this.X)) {
                        h.this.h(l, this.Y, this.Z);
                    }
                }
            }
        }

        /* renamed from: o.ye1$h$e */
        /* loaded from: classes.dex */
        public class e extends MediaBrowserService {
            public e(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                Bundle bundle2;
                MediaSessionCompat.b(bundle);
                h hVar = h.this;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                e j = hVar.j(str, i, bundle2);
                if (j == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(j.a, j.b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                h.this.k(str, new n<>(result));
            }
        }

        public h() {
        }

        @Override // o.AbstractServiceC11001ye1.g
        public void a(C5630ch1.b bVar, String str, Bundle bundle) {
            g(bVar, str, bundle);
        }

        @Override // o.AbstractServiceC11001ye1.g
        public C5630ch1.b b() {
            f fVar = AbstractServiceC11001ye1.this.Z0;
            if (fVar != null) {
                return fVar.d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // o.AbstractServiceC11001ye1.g
        public void c(String str, Bundle bundle) {
            i(str, bundle);
            f(str, bundle);
        }

        @Override // o.AbstractServiceC11001ye1.g
        public void d(MediaSessionCompat.Token token) {
            AbstractServiceC11001ye1.this.a1.a(new a(token));
        }

        @Override // o.AbstractServiceC11001ye1.g
        public Bundle e() {
            if (this.c == null) {
                return null;
            }
            f fVar = AbstractServiceC11001ye1.this.Z0;
            if (fVar != null) {
                if (fVar.e == null) {
                    return null;
                }
                return new Bundle(AbstractServiceC11001ye1.this.Z0.e);
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        public void f(String str, Bundle bundle) {
            AbstractServiceC11001ye1.this.a1.post(new c(str, bundle));
        }

        public void g(C5630ch1.b bVar, String str, Bundle bundle) {
            AbstractServiceC11001ye1.this.a1.post(new d(bVar, str, bundle));
        }

        public void h(f fVar, String str, Bundle bundle) {
            List<C4377Tx1<IBinder, Bundle>> list = fVar.g.get(str);
            if (list != null) {
                for (C4377Tx1<IBinder, Bundle> c4377Tx1 : list) {
                    if (C10515we1.b(bundle, c4377Tx1.b)) {
                        AbstractServiceC11001ye1.this.t(str, fVar, c4377Tx1.b, bundle);
                    }
                }
            }
        }

        public void i(String str, Bundle bundle) {
            this.b.notifyChildrenChanged(str);
        }

        public e j(String str, int i, Bundle bundle) {
            Bundle bundle2;
            IBinder asBinder;
            int i2 = -1;
            if (bundle != null && bundle.getInt(C10758xe1.p, 0) != 0) {
                bundle.remove(C10758xe1.p);
                this.c = new Messenger(AbstractServiceC11001ye1.this.a1);
                bundle2 = new Bundle();
                bundle2.putInt(C10758xe1.r, 2);
                C7136ir.b(bundle2, C10758xe1.s, this.c.getBinder());
                MediaSessionCompat.Token token = AbstractServiceC11001ye1.this.b1;
                if (token != null) {
                    android.support.v4.media.session.b d2 = token.d();
                    if (d2 == null) {
                        asBinder = null;
                    } else {
                        asBinder = d2.asBinder();
                    }
                    C7136ir.b(bundle2, C10758xe1.t, asBinder);
                } else {
                    this.a.add(bundle2);
                }
                i2 = bundle.getInt(C10758xe1.q, -1);
                bundle.remove(C10758xe1.q);
            } else {
                bundle2 = null;
            }
            f fVar = new f(str, i2, i, bundle, null);
            AbstractServiceC11001ye1 abstractServiceC11001ye1 = AbstractServiceC11001ye1.this;
            abstractServiceC11001ye1.Z0 = fVar;
            e l = abstractServiceC11001ye1.l(str, i, bundle);
            AbstractServiceC11001ye1 abstractServiceC11001ye12 = AbstractServiceC11001ye1.this;
            abstractServiceC11001ye12.Z0 = null;
            if (l == null) {
                return null;
            }
            if (this.c != null) {
                abstractServiceC11001ye12.Z.add(fVar);
            }
            if (bundle2 == null) {
                bundle2 = l.c();
            } else if (l.c() != null) {
                bundle2.putAll(l.c());
            }
            return new e(l.d(), bundle2);
        }

        public void k(String str, n<List<Parcel>> nVar) {
            b bVar = new b(str, nVar);
            AbstractServiceC11001ye1 abstractServiceC11001ye1 = AbstractServiceC11001ye1.this;
            abstractServiceC11001ye1.Z0 = abstractServiceC11001ye1.Y;
            abstractServiceC11001ye1.m(str, bVar);
            AbstractServiceC11001ye1.this.Z0 = null;
        }

        public void l(MediaSessionCompat.Token token) {
            if (!this.a.isEmpty()) {
                android.support.v4.media.session.b d2 = token.d();
                if (d2 != null) {
                    for (Bundle bundle : this.a) {
                        C7136ir.b(bundle, C10758xe1.t, d2.asBinder());
                    }
                }
                this.a.clear();
            }
            this.b.setSessionToken((MediaSession.Token) token.f());
        }

        @Override // o.AbstractServiceC11001ye1.g
        public IBinder onBind(Intent intent) {
            return this.b.onBind(intent);
        }

        @Override // o.AbstractServiceC11001ye1.g
        public void onCreate() {
            e eVar = new e(AbstractServiceC11001ye1.this);
            this.b = eVar;
            eVar.onCreate();
        }
    }

    /* renamed from: o.ye1$i */
    /* loaded from: classes.dex */
    public class i extends h {

        /* renamed from: o.ye1$i$a */
        /* loaded from: classes.dex */
        public class a extends m<MediaBrowserCompat.MediaItem> {
            public final /* synthetic */ n f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, n nVar) {
                super(obj);
                this.f = nVar;
            }

            @Override // o.AbstractServiceC11001ye1.m
            public void b() {
                this.f.a();
            }

            @Override // o.AbstractServiceC11001ye1.m
            /* renamed from: l */
            public void g(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f.c(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f.c(obtain);
            }
        }

        /* renamed from: o.ye1$i$b */
        /* loaded from: classes.dex */
        public class b extends h.e {
            public b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                i.this.m(str, new n<>(result));
            }
        }

        public i() {
            super();
        }

        public void m(String str, n<Parcel> nVar) {
            a aVar = new a(str, nVar);
            AbstractServiceC11001ye1 abstractServiceC11001ye1 = AbstractServiceC11001ye1.this;
            abstractServiceC11001ye1.Z0 = abstractServiceC11001ye1.Y;
            abstractServiceC11001ye1.o(str, aVar);
            AbstractServiceC11001ye1.this.Z0 = null;
        }

        @Override // o.AbstractServiceC11001ye1.h, o.AbstractServiceC11001ye1.g
        public void onCreate() {
            b bVar = new b(AbstractServiceC11001ye1.this);
            this.b = bVar;
            bVar.onCreate();
        }
    }

    /* renamed from: o.ye1$j */
    /* loaded from: classes.dex */
    public class j extends i {

        /* renamed from: o.ye1$j$a */
        /* loaded from: classes.dex */
        public class a extends m<List<MediaBrowserCompat.MediaItem>> {
            public final /* synthetic */ n f;
            public final /* synthetic */ Bundle g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, n nVar, Bundle bundle) {
                super(obj);
                this.f = nVar;
                this.g = bundle;
            }

            @Override // o.AbstractServiceC11001ye1.m
            public void b() {
                this.f.a();
            }

            @Override // o.AbstractServiceC11001ye1.m
            /* renamed from: l */
            public void g(List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f.c(null);
                    return;
                }
                if ((c() & 1) != 0) {
                    list = AbstractServiceC11001ye1.this.b(list, this.g);
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaBrowserCompat.MediaItem mediaItem : list) {
                    Parcel obtain = Parcel.obtain();
                    mediaItem.writeToParcel(obtain, 0);
                    arrayList.add(obtain);
                }
                this.f.c(arrayList);
            }
        }

        /* renamed from: o.ye1$j$b */
        /* loaded from: classes.dex */
        public class b extends i.b {
            public b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                j jVar = j.this;
                AbstractServiceC11001ye1 abstractServiceC11001ye1 = AbstractServiceC11001ye1.this;
                abstractServiceC11001ye1.Z0 = abstractServiceC11001ye1.Y;
                jVar.n(str, new n<>(result), bundle);
                AbstractServiceC11001ye1.this.Z0 = null;
            }
        }

        public j() {
            super();
        }

        @Override // o.AbstractServiceC11001ye1.h, o.AbstractServiceC11001ye1.g
        public Bundle e() {
            AbstractServiceC11001ye1 abstractServiceC11001ye1 = AbstractServiceC11001ye1.this;
            f fVar = abstractServiceC11001ye1.Z0;
            if (fVar != null) {
                if (fVar == abstractServiceC11001ye1.Y) {
                    return this.b.getBrowserRootHints();
                }
                if (fVar.e == null) {
                    return null;
                }
                return new Bundle(AbstractServiceC11001ye1.this.Z0.e);
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // o.AbstractServiceC11001ye1.h
        public void i(String str, Bundle bundle) {
            if (bundle != null) {
                this.b.notifyChildrenChanged(str, bundle);
            } else {
                super.i(str, bundle);
            }
        }

        public void n(String str, n<List<Parcel>> nVar, Bundle bundle) {
            a aVar = new a(str, nVar, bundle);
            AbstractServiceC11001ye1 abstractServiceC11001ye1 = AbstractServiceC11001ye1.this;
            abstractServiceC11001ye1.Z0 = abstractServiceC11001ye1.Y;
            abstractServiceC11001ye1.n(str, aVar, bundle);
            AbstractServiceC11001ye1.this.Z0 = null;
        }

        @Override // o.AbstractServiceC11001ye1.i, o.AbstractServiceC11001ye1.h, o.AbstractServiceC11001ye1.g
        public void onCreate() {
            b bVar = new b(AbstractServiceC11001ye1.this);
            this.b = bVar;
            bVar.onCreate();
        }
    }

    /* renamed from: o.ye1$k */
    /* loaded from: classes.dex */
    public class k extends j {
        public k() {
            super();
        }

        @Override // o.AbstractServiceC11001ye1.h, o.AbstractServiceC11001ye1.g
        public C5630ch1.b b() {
            MediaSessionManager.RemoteUserInfo currentBrowserInfo;
            AbstractServiceC11001ye1 abstractServiceC11001ye1 = AbstractServiceC11001ye1.this;
            f fVar = abstractServiceC11001ye1.Z0;
            if (fVar != null) {
                if (fVar == abstractServiceC11001ye1.Y) {
                    currentBrowserInfo = this.b.getCurrentBrowserInfo();
                    return new C5630ch1.b(currentBrowserInfo);
                }
                return fVar.d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    /* renamed from: o.ye1$l */
    /* loaded from: classes.dex */
    public class l implements g {
        public Messenger a;

        /* renamed from: o.ye1$l$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ MediaSessionCompat.Token X;

            public a(MediaSessionCompat.Token token) {
                this.X = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<f> it = AbstractServiceC11001ye1.this.Y0.values().iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    try {
                        next.f.c(next.h.d(), this.X, next.h.c());
                    } catch (RemoteException unused) {
                        Log.w(AbstractServiceC11001ye1.c1, "Connection for " + next.a + " is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: o.ye1$l$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ String X;
            public final /* synthetic */ Bundle Y;

            public b(String str, Bundle bundle) {
                this.X = str;
                this.Y = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (IBinder iBinder : AbstractServiceC11001ye1.this.Y0.keySet()) {
                    C2531Be<IBinder, f> c2531Be = AbstractServiceC11001ye1.this.Y0;
                    l.this.f(c2531Be.get(iBinder), this.X, this.Y);
                }
            }
        }

        /* renamed from: o.ye1$l$c */
        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ C5630ch1.b X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ Bundle Z;

            public c(C5630ch1.b bVar, String str, Bundle bundle) {
                this.X = bVar;
                this.Y = str;
                this.Z = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < AbstractServiceC11001ye1.this.Y0.size(); i++) {
                    f l = AbstractServiceC11001ye1.this.Y0.l(i);
                    if (l.d.equals(this.X)) {
                        l.this.f(l, this.Y, this.Z);
                        return;
                    }
                }
            }
        }

        public l() {
        }

        @Override // o.AbstractServiceC11001ye1.g
        public void a(C5630ch1.b bVar, String str, Bundle bundle) {
            AbstractServiceC11001ye1.this.a1.post(new c(bVar, str, bundle));
        }

        @Override // o.AbstractServiceC11001ye1.g
        public C5630ch1.b b() {
            f fVar = AbstractServiceC11001ye1.this.Z0;
            if (fVar != null) {
                return fVar.d;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // o.AbstractServiceC11001ye1.g
        public void c(String str, Bundle bundle) {
            AbstractServiceC11001ye1.this.a1.post(new b(str, bundle));
        }

        @Override // o.AbstractServiceC11001ye1.g
        public void d(MediaSessionCompat.Token token) {
            AbstractServiceC11001ye1.this.a1.post(new a(token));
        }

        @Override // o.AbstractServiceC11001ye1.g
        public Bundle e() {
            f fVar = AbstractServiceC11001ye1.this.Z0;
            if (fVar != null) {
                if (fVar.e == null) {
                    return null;
                }
                return new Bundle(AbstractServiceC11001ye1.this.Z0.e);
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        public void f(f fVar, String str, Bundle bundle) {
            List<C4377Tx1<IBinder, Bundle>> list = fVar.g.get(str);
            if (list != null) {
                for (C4377Tx1<IBinder, Bundle> c4377Tx1 : list) {
                    if (C10515we1.b(bundle, c4377Tx1.b)) {
                        AbstractServiceC11001ye1.this.t(str, fVar, c4377Tx1.b, bundle);
                    }
                }
            }
        }

        @Override // o.AbstractServiceC11001ye1.g
        public IBinder onBind(Intent intent) {
            if (AbstractServiceC11001ye1.f1.equals(intent.getAction())) {
                return this.a.getBinder();
            }
            return null;
        }

        @Override // o.AbstractServiceC11001ye1.g
        public void onCreate() {
            this.a = new Messenger(AbstractServiceC11001ye1.this.a1);
        }
    }

    /* renamed from: o.ye1$n */
    /* loaded from: classes.dex */
    public static class n<T> {
        public MediaBrowserService.Result a;

        public n(MediaBrowserService.Result result) {
            this.a = result;
        }

        public void a() {
            this.a.detach();
        }

        public List<MediaBrowser.MediaItem> b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void c(T t) {
            if (t instanceof List) {
                this.a.sendResult(b((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.a.sendResult(null);
            }
        }
    }

    /* renamed from: o.ye1$o */
    /* loaded from: classes.dex */
    public class o {

        /* renamed from: o.ye1$o$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ p X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ int Y0;
            public final /* synthetic */ int Z;
            public final /* synthetic */ Bundle Z0;

            public a(p pVar, String str, int i, int i2, Bundle bundle) {
                this.X = pVar;
                this.Y = str;
                this.Z = i;
                this.Y0 = i2;
                this.Z0 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.X.asBinder();
                AbstractServiceC11001ye1.this.Y0.remove(asBinder);
                f fVar = new f(this.Y, this.Z, this.Y0, this.Z0, this.X);
                AbstractServiceC11001ye1 abstractServiceC11001ye1 = AbstractServiceC11001ye1.this;
                abstractServiceC11001ye1.Z0 = fVar;
                e l = abstractServiceC11001ye1.l(this.Y, this.Y0, this.Z0);
                fVar.h = l;
                AbstractServiceC11001ye1 abstractServiceC11001ye12 = AbstractServiceC11001ye1.this;
                abstractServiceC11001ye12.Z0 = null;
                if (l == null) {
                    Log.i(AbstractServiceC11001ye1.c1, "No root for client " + this.Y + " from service " + getClass().getName());
                    try {
                        this.X.b();
                        return;
                    } catch (RemoteException unused) {
                        Log.w(AbstractServiceC11001ye1.c1, "Calling onConnectFailed() failed. Ignoring. pkg=" + this.Y);
                        return;
                    }
                }
                try {
                    abstractServiceC11001ye12.Y0.put(asBinder, fVar);
                    asBinder.linkToDeath(fVar, 0);
                    if (AbstractServiceC11001ye1.this.b1 != null) {
                        this.X.c(fVar.h.d(), AbstractServiceC11001ye1.this.b1, fVar.h.c());
                    }
                } catch (RemoteException unused2) {
                    Log.w(AbstractServiceC11001ye1.c1, "Calling onConnect() failed. Dropping client. pkg=" + this.Y);
                    AbstractServiceC11001ye1.this.Y0.remove(asBinder);
                }
            }
        }

        /* renamed from: o.ye1$o$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ p X;

            public b(p pVar) {
                this.X = pVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f remove = AbstractServiceC11001ye1.this.Y0.remove(this.X.asBinder());
                if (remove != null) {
                    remove.f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: o.ye1$o$c */
        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ p X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ Bundle Y0;
            public final /* synthetic */ IBinder Z;

            public c(p pVar, String str, IBinder iBinder, Bundle bundle) {
                this.X = pVar;
                this.Y = str;
                this.Z = iBinder;
                this.Y0 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = AbstractServiceC11001ye1.this.Y0.get(this.X.asBinder());
                if (fVar == null) {
                    Log.w(AbstractServiceC11001ye1.c1, "addSubscription for callback that isn't registered id=" + this.Y);
                    return;
                }
                AbstractServiceC11001ye1.this.a(this.Y, fVar, this.Z, this.Y0);
            }
        }

        /* renamed from: o.ye1$o$d */
        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ p X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ IBinder Z;

            public d(p pVar, String str, IBinder iBinder) {
                this.X = pVar;
                this.Y = str;
                this.Z = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = AbstractServiceC11001ye1.this.Y0.get(this.X.asBinder());
                if (fVar == null) {
                    Log.w(AbstractServiceC11001ye1.c1, "removeSubscription for callback that isn't registered id=" + this.Y);
                } else if (!AbstractServiceC11001ye1.this.w(this.Y, fVar, this.Z)) {
                    Log.w(AbstractServiceC11001ye1.c1, "removeSubscription called for " + this.Y + " which is not subscribed");
                }
            }
        }

        /* renamed from: o.ye1$o$e */
        /* loaded from: classes.dex */
        public class e implements Runnable {
            public final /* synthetic */ p X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ XT1 Z;

            public e(p pVar, String str, XT1 xt1) {
                this.X = pVar;
                this.Y = str;
                this.Z = xt1;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = AbstractServiceC11001ye1.this.Y0.get(this.X.asBinder());
                if (fVar == null) {
                    Log.w(AbstractServiceC11001ye1.c1, "getMediaItem for callback that isn't registered id=" + this.Y);
                    return;
                }
                AbstractServiceC11001ye1.this.u(this.Y, fVar, this.Z);
            }
        }

        /* renamed from: o.ye1$o$f */
        /* loaded from: classes.dex */
        public class f implements Runnable {
            public final /* synthetic */ p X;
            public final /* synthetic */ int Y;
            public final /* synthetic */ int Y0;
            public final /* synthetic */ String Z;
            public final /* synthetic */ Bundle Z0;

            public f(p pVar, int i, String str, int i2, Bundle bundle) {
                this.X = pVar;
                this.Y = i;
                this.Z = str;
                this.Y0 = i2;
                this.Z0 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar;
                IBinder asBinder = this.X.asBinder();
                AbstractServiceC11001ye1.this.Y0.remove(asBinder);
                Iterator<f> it = AbstractServiceC11001ye1.this.Z.iterator();
                while (true) {
                    fVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    if (next.c == this.Y) {
                        if (TextUtils.isEmpty(this.Z) || this.Y0 <= 0) {
                            fVar = new f(next.a, next.b, next.c, this.Z0, this.X);
                        }
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = new f(this.Z, this.Y0, this.Y, this.Z0, this.X);
                }
                AbstractServiceC11001ye1.this.Y0.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w(AbstractServiceC11001ye1.c1, "IBinder is already dead.");
                }
            }
        }

        /* renamed from: o.ye1$o$g */
        /* loaded from: classes.dex */
        public class g implements Runnable {
            public final /* synthetic */ p X;

            public g(p pVar) {
                this.X = pVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.X.asBinder();
                f remove = AbstractServiceC11001ye1.this.Y0.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: o.ye1$o$h */
        /* loaded from: classes.dex */
        public class h implements Runnable {
            public final /* synthetic */ p X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ XT1 Y0;
            public final /* synthetic */ Bundle Z;

            public h(p pVar, String str, Bundle bundle, XT1 xt1) {
                this.X = pVar;
                this.Y = str;
                this.Z = bundle;
                this.Y0 = xt1;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = AbstractServiceC11001ye1.this.Y0.get(this.X.asBinder());
                if (fVar == null) {
                    Log.w(AbstractServiceC11001ye1.c1, "search for callback that isn't registered query=" + this.Y);
                    return;
                }
                AbstractServiceC11001ye1.this.v(this.Y, this.Z, fVar, this.Y0);
            }
        }

        /* renamed from: o.ye1$o$i */
        /* loaded from: classes.dex */
        public class i implements Runnable {
            public final /* synthetic */ p X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ XT1 Y0;
            public final /* synthetic */ Bundle Z;

            public i(p pVar, String str, Bundle bundle, XT1 xt1) {
                this.X = pVar;
                this.Y = str;
                this.Z = bundle;
                this.Y0 = xt1;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = AbstractServiceC11001ye1.this.Y0.get(this.X.asBinder());
                if (fVar == null) {
                    Log.w(AbstractServiceC11001ye1.c1, "sendCustomAction for callback that isn't registered action=" + this.Y + ", extras=" + this.Z);
                    return;
                }
                AbstractServiceC11001ye1.this.s(this.Y, this.Z, fVar, this.Y0);
            }
        }

        public o() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, p pVar) {
            AbstractServiceC11001ye1.this.a1.a(new c(pVar, str, iBinder, bundle));
        }

        public void b(String str, int i2, int i3, Bundle bundle, p pVar) {
            if (AbstractServiceC11001ye1.this.g(str, i3)) {
                AbstractServiceC11001ye1.this.a1.a(new a(pVar, str, i2, i3, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + str);
        }

        public void c(p pVar) {
            AbstractServiceC11001ye1.this.a1.a(new b(pVar));
        }

        public void d(String str, XT1 xt1, p pVar) {
            if (!TextUtils.isEmpty(str) && xt1 != null) {
                AbstractServiceC11001ye1.this.a1.a(new e(pVar, str, xt1));
            }
        }

        public void e(p pVar, String str, int i2, int i3, Bundle bundle) {
            AbstractServiceC11001ye1.this.a1.a(new f(pVar, i3, str, i2, bundle));
        }

        public void f(String str, IBinder iBinder, p pVar) {
            AbstractServiceC11001ye1.this.a1.a(new d(pVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, XT1 xt1, p pVar) {
            if (!TextUtils.isEmpty(str) && xt1 != null) {
                AbstractServiceC11001ye1.this.a1.a(new h(pVar, str, bundle, xt1));
            }
        }

        public void h(String str, Bundle bundle, XT1 xt1, p pVar) {
            if (!TextUtils.isEmpty(str) && xt1 != null) {
                AbstractServiceC11001ye1.this.a1.a(new i(pVar, str, bundle, xt1));
            }
        }

        public void i(p pVar) {
            AbstractServiceC11001ye1.this.a1.a(new g(pVar));
        }
    }

    /* renamed from: o.ye1$p */
    /* loaded from: classes.dex */
    public interface p {
        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        void b() throws RemoteException;

        void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* renamed from: o.ye1$q */
    /* loaded from: classes.dex */
    public static class q implements p {
        public final Messenger a;

        public q(Messenger messenger) {
            this.a = messenger;
        }

        @Override // o.AbstractServiceC11001ye1.p
        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            ArrayList<? extends Parcelable> arrayList;
            Bundle bundle3 = new Bundle();
            bundle3.putString(C10758xe1.d, str);
            bundle3.putBundle(C10758xe1.g, bundle);
            bundle3.putBundle(C10758xe1.h, bundle2);
            if (list != null) {
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList<>(list);
                }
                bundle3.putParcelableArrayList(C10758xe1.e, arrayList);
            }
            d(3, bundle3);
        }

        @Override // o.AbstractServiceC11001ye1.p
        public IBinder asBinder() {
            return this.a.getBinder();
        }

        @Override // o.AbstractServiceC11001ye1.p
        public void b() throws RemoteException {
            d(2, null);
        }

        @Override // o.AbstractServiceC11001ye1.p
        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(C10758xe1.r, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(C10758xe1.d, str);
            bundle2.putParcelable(C10758xe1.f, token);
            bundle2.putBundle(C10758xe1.k, bundle);
            d(1, bundle2);
        }

        public final void d(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.a.send(obtain);
        }
    }

    /* renamed from: o.ye1$r */
    /* loaded from: classes.dex */
    public final class r extends Handler {
        public final o a;

        public r() {
            this.a = new o();
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle(C10758xe1.k);
                    MediaSessionCompat.b(bundle);
                    this.a.b(data.getString(C10758xe1.i), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new q(message.replyTo));
                    return;
                case 2:
                    this.a.c(new q(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle(C10758xe1.g);
                    MediaSessionCompat.b(bundle2);
                    this.a.a(data.getString(C10758xe1.d), C7136ir.a(data, C10758xe1.a), bundle2, new q(message.replyTo));
                    return;
                case 4:
                    this.a.f(data.getString(C10758xe1.d), C7136ir.a(data, C10758xe1.a), new q(message.replyTo));
                    return;
                case 5:
                    this.a.d(data.getString(C10758xe1.d), (XT1) data.getParcelable(C10758xe1.j), new q(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(C10758xe1.k);
                    MediaSessionCompat.b(bundle3);
                    this.a.e(new q(message.replyTo), data.getString(C10758xe1.i), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.a.i(new q(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle(C10758xe1.l);
                    MediaSessionCompat.b(bundle4);
                    this.a.g(data.getString(C10758xe1.m), bundle4, (XT1) data.getParcelable(C10758xe1.j), new q(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle(C10758xe1.f910o);
                    MediaSessionCompat.b(bundle5);
                    this.a.h(data.getString(C10758xe1.n), bundle5, (XT1) data.getParcelable(C10758xe1.j), new q(message.replyTo));
                    return;
                default:
                    Log.w(AbstractServiceC11001ye1.c1, "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<C4377Tx1<IBinder, Bundle>> list = fVar.g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C4377Tx1<IBinder, Bundle> c4377Tx1 : list) {
            if (iBinder == c4377Tx1.a && C10515we1.a(bundle, c4377Tx1.b)) {
                return;
            }
        }
        list.add(new C4377Tx1<>(iBinder, bundle));
        fVar.g.put(str, list);
        t(str, fVar, bundle, null);
        this.Z0 = fVar;
        q(str, bundle);
        this.Z0 = null;
    }

    public List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt(MediaBrowserCompat.d, -1);
        int i3 = bundle.getInt(MediaBrowserCompat.e, -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int i5 = i4 + i3;
        if (i2 >= 0 && i3 >= 1 && i4 < list.size()) {
            if (i5 > list.size()) {
                i5 = list.size();
            }
            return list.subList(i4, i5);
        }
        return Collections.EMPTY_LIST;
    }

    public void c(Context context) {
        attachBaseContext(context);
    }

    public final Bundle d() {
        return this.X.e();
    }

    public final C5630ch1.b e() {
        return this.X.b();
    }

    public MediaSessionCompat.Token f() {
        return this.b1;
    }

    public boolean g(String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i2)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void h(String str) {
        if (str != null) {
            this.X.c(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void i(String str, Bundle bundle) {
        if (str != null) {
            if (bundle != null) {
                this.X.c(str, bundle);
                return;
            }
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void j(C5630ch1.b bVar, String str, Bundle bundle) {
        if (bVar != null) {
            if (str != null) {
                if (bundle != null) {
                    this.X.a(bVar, str, bundle);
                    return;
                }
                throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
            }
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
    }

    public void k(String str, Bundle bundle, m<Bundle> mVar) {
        mVar.h(null);
    }

    public abstract e l(String str, int i2, Bundle bundle);

    public abstract void m(String str, m<List<MediaBrowserCompat.MediaItem>> mVar);

    public void n(String str, m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
        mVar.k(1);
        m(str, mVar);
    }

    public void o(String str, m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.k(2);
        mVar.j(null);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.X.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.X = new k();
        } else if (i2 >= 26) {
            this.X = new j();
        } else {
            this.X = new i();
        }
        this.X.onCreate();
    }

    public void p(String str, Bundle bundle, m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.k(4);
        mVar.j(null);
    }

    public void s(String str, Bundle bundle, f fVar, XT1 xt1) {
        d dVar = new d(str, xt1);
        this.Z0 = fVar;
        k(str, bundle, dVar);
        this.Z0 = null;
        if (dVar.d()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    public void t(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.Z0 = fVar;
        if (bundle == null) {
            m(str, aVar);
        } else {
            n(str, aVar, bundle);
        }
        this.Z0 = null;
        if (aVar.d()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.a + " id=" + str);
    }

    public void u(String str, f fVar, XT1 xt1) {
        b bVar = new b(str, xt1);
        this.Z0 = fVar;
        o(str, bVar);
        this.Z0 = null;
        if (bVar.d()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    public void v(String str, Bundle bundle, f fVar, XT1 xt1) {
        c cVar = new c(str, xt1);
        this.Z0 = fVar;
        p(str, bundle, cVar);
        this.Z0 = null;
        if (cVar.d()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    public boolean w(String str, f fVar, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder == null) {
                if (fVar.g.remove(str) != null) {
                    z = true;
                }
            } else {
                List<C4377Tx1<IBinder, Bundle>> list = fVar.g.get(str);
                if (list != null) {
                    Iterator<C4377Tx1<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().a) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (list.size() == 0) {
                        fVar.g.remove(str);
                    }
                }
            }
            return z;
        } finally {
            this.Z0 = fVar;
            r(str);
            this.Z0 = null;
        }
    }

    public void x(MediaSessionCompat.Token token) {
        if (token != null) {
            if (this.b1 == null) {
                this.b1 = token;
                this.X.d(token);
                return;
            }
            throw new IllegalStateException("The session token has already been set");
        }
        throw new IllegalArgumentException("Session token may not be null");
    }

    /* renamed from: o.ye1$m */
    /* loaded from: classes.dex */
    public static class m<T> {
        public final Object a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;

        public m(Object obj) {
            this.a = obj;
        }

        public final void a(Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.g)) {
                float f = bundle.getFloat(MediaBrowserCompat.g);
                if (f < -1.0E-5f || f > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]");
                }
            }
        }

        public void b() {
            if (!this.b) {
                if (!this.c) {
                    if (!this.d) {
                        this.b = true;
                        return;
                    }
                    throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.a);
                }
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.a);
            }
            throw new IllegalStateException("detach() called when detach() had already been called for: " + this.a);
        }

        public int c() {
            return this.e;
        }

        public boolean d() {
            if (!this.b && !this.c && !this.d) {
                return false;
            }
            return true;
        }

        public void e(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.a);
        }

        public void f(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.a);
        }

        public void h(Bundle bundle) {
            if (!this.c && !this.d) {
                this.d = true;
                e(bundle);
                return;
            }
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.a);
        }

        public void i(Bundle bundle) {
            if (!this.c && !this.d) {
                a(bundle);
                f(bundle);
                return;
            }
            throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.a);
        }

        public void j(T t) {
            if (!this.c && !this.d) {
                this.c = true;
                g(t);
                return;
            }
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.a);
        }

        public void k(int i) {
            this.e = i;
        }

        public void g(T t) {
        }
    }

    public void r(String str) {
    }

    public void q(String str, Bundle bundle) {
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
