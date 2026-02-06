package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.AbstractServiceC11001ye1;
import o.C10515we1;
import o.C10758xe1;
import o.C2531Be;
import o.C7136ir;
import o.C9811tl1;
import o.XT1;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {
    public static final String b = "MediaBrowserCompat";
    public static final boolean c = Log.isLoggable(b, 3);
    public static final String d = "android.media.browse.extra.PAGE";
    public static final String e = "android.media.browse.extra.PAGE_SIZE";
    public static final String f = "android.media.browse.extra.MEDIA_ID";
    public static final String g = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String h = "android.support.v4.media.action.DOWNLOAD";
    public static final String i = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    public final f a;

    /* loaded from: classes.dex */
    public static class CustomActionResultReceiver extends XT1 {
        public final String Y0;
        public final Bundle Z0;
        public final d a1;

        public CustomActionResultReceiver(String str, Bundle bundle, d dVar, Handler handler) {
            super(handler);
            this.Y0 = str;
            this.Z0 = bundle;
            this.a1 = dVar;
        }

        @Override // o.XT1
        public void a(int i, Bundle bundle) {
            if (this.a1 == null) {
                return;
            }
            MediaSessionCompat.b(bundle);
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        Log.w(MediaBrowserCompat.b, "Unknown result code: " + i + " (extras=" + this.Z0 + ", resultData=" + bundle + C9811tl1.d);
                        return;
                    }
                    this.a1.b(this.Y0, this.Z0, bundle);
                    return;
                }
                this.a1.c(this.Y0, this.Z0, bundle);
                return;
            }
            this.a1.a(this.Y0, this.Z0, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class ItemReceiver extends XT1 {
        public final String Y0;
        public final e Z0;

        public ItemReceiver(String str, e eVar, Handler handler) {
            super(handler);
            this.Y0 = str;
            this.Z0 = eVar;
        }

        @Override // o.XT1
        public void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.G(bundle);
            }
            if (i == 0 && bundle != null && bundle.containsKey(AbstractServiceC11001ye1.g1)) {
                Parcelable parcelable = bundle.getParcelable(AbstractServiceC11001ye1.g1);
                if (parcelable != null && !(parcelable instanceof MediaItem)) {
                    this.Z0.a(this.Y0);
                    return;
                } else {
                    this.Z0.b((MediaItem) parcelable);
                    return;
                }
            }
            this.Z0.a(this.Y0);
        }
    }

    /* loaded from: classes.dex */
    public static class SearchResultReceiver extends XT1 {
        public final String Y0;
        public final Bundle Z0;
        public final l a1;

        public SearchResultReceiver(String str, Bundle bundle, l lVar, Handler handler) {
            super(handler);
            this.Y0 = str;
            this.Z0 = bundle;
            this.a1 = lVar;
        }

        @Override // o.XT1
        public void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.G(bundle);
            }
            if (i == 0 && bundle != null && bundle.containsKey(AbstractServiceC11001ye1.h1)) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(AbstractServiceC11001ye1.h1);
                if (parcelableArray != null) {
                    ArrayList arrayList = new ArrayList(parcelableArray.length);
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaItem) parcelable);
                    }
                    this.a1.b(this.Y0, this.Z0, arrayList);
                    return;
                }
                this.a1.a(this.Y0, this.Z0);
                return;
            }
            this.a1.a(this.Y0, this.Z0);
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        public static int b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Handler {
        public final WeakReference<k> a;
        public WeakReference<Messenger> b;

        public b(k kVar) {
            this.a = new WeakReference<>(kVar);
        }

        public void a(Messenger messenger) {
            this.b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.b;
            if (weakReference != null && weakReference.get() != null && this.a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.b(data);
                k kVar = this.a.get();
                Messenger messenger = this.b.get();
                try {
                    int i = message.what;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                Log.w(MediaBrowserCompat.b, "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                                return;
                            }
                            Bundle bundle = data.getBundle(C10758xe1.g);
                            MediaSessionCompat.b(bundle);
                            Bundle bundle2 = data.getBundle(C10758xe1.h);
                            MediaSessionCompat.b(bundle2);
                            kVar.e(messenger, data.getString(C10758xe1.d), data.getParcelableArrayList(C10758xe1.e), bundle, bundle2);
                            return;
                        }
                        kVar.o(messenger);
                        return;
                    }
                    Bundle bundle3 = data.getBundle(C10758xe1.k);
                    MediaSessionCompat.b(bundle3);
                    kVar.j(messenger, data.getString(C10758xe1.d), (MediaSessionCompat.Token) data.getParcelable(C10758xe1.f), bundle3);
                } catch (BadParcelableException unused) {
                    Log.e(MediaBrowserCompat.b, "Could not unparcel the data.");
                    if (message.what == 1) {
                        kVar.o(messenger);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final MediaBrowser.ConnectionCallback a = new a();
        public b b;

        /* loaded from: classes.dex */
        public class a extends MediaBrowser.ConnectionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                b bVar = c.this.b;
                if (bVar != null) {
                    bVar.g();
                }
                c.this.a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                b bVar = c.this.b;
                if (bVar != null) {
                    bVar.h();
                }
                c.this.b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                b bVar = c.this.b;
                if (bVar != null) {
                    bVar.m();
                }
                c.this.c();
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            void g();

            void h();

            void m();
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d(b bVar) {
            this.b = bVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public void a(String str, Bundle bundle, Bundle bundle2) {
        }

        public void b(String str, Bundle bundle, Bundle bundle2) {
        }

        public void c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public final MediaBrowser.ItemCallback a = new a();

        /* loaded from: classes.dex */
        public class a extends MediaBrowser.ItemCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(String str) {
                e.this.a(str);
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
                e.this.b(MediaItem.a(mediaItem));
            }
        }

        public void a(String str) {
        }

        public void b(MediaItem mediaItem) {
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a();

        MediaSessionCompat.Token b();

        void c();

        void d(String str, Bundle bundle, d dVar);

        void f();

        Bundle getExtras();

        String getRoot();

        void i(String str, Bundle bundle, l lVar);

        ComponentName k();

        void l(String str, e eVar);

        void n(String str, Bundle bundle, o oVar);

        void p(String str, o oVar);

        Bundle q();
    }

    /* loaded from: classes.dex */
    public static class g implements f, k, c.b {
        public final Context a;
        public final MediaBrowser b;
        public final Bundle c;
        public final b d = new b(this);
        public final C2531Be<String, n> e = new C2531Be<>();
        public int f;
        public m g;
        public Messenger h;
        public MediaSessionCompat.Token i;
        public Bundle j;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ e X;
            public final /* synthetic */ String Y;

            public a(e eVar, String str) {
                this.X = eVar;
                this.Y = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a(this.Y);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ e X;
            public final /* synthetic */ String Y;

            public b(e eVar, String str) {
                this.X = eVar;
                this.Y = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a(this.Y);
            }
        }

        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ e X;
            public final /* synthetic */ String Y;

            public c(e eVar, String str) {
                this.X = eVar;
                this.Y = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a(this.Y);
            }
        }

        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ l X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ Bundle Z;

            public d(l lVar, String str, Bundle bundle) {
                this.X = lVar;
                this.Y = str;
                this.Z = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a(this.Y, this.Z);
            }
        }

        /* loaded from: classes.dex */
        public class e implements Runnable {
            public final /* synthetic */ l X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ Bundle Z;

            public e(l lVar, String str, Bundle bundle) {
                this.X = lVar;
                this.Y = str;
                this.Z = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a(this.Y, this.Z);
            }
        }

        /* loaded from: classes.dex */
        public class f implements Runnable {
            public final /* synthetic */ d X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ Bundle Z;

            public f(d dVar, String str, Bundle bundle) {
                this.X = dVar;
                this.Y = str;
                this.Z = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a(this.Y, this.Z, null);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$g$g  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0000g implements Runnable {
            public final /* synthetic */ d X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ Bundle Z;

            public RunnableC0000g(d dVar, String str, Bundle bundle) {
                this.X = dVar;
                this.Y = str;
                this.Z = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a(this.Y, this.Z, null);
            }
        }

        public g(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            Bundle bundle2;
            this.a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.c = bundle2;
            bundle2.putInt(C10758xe1.p, 1);
            bundle2.putInt(C10758xe1.q, Process.myPid());
            cVar.d(this);
            this.b = new MediaBrowser(context, componentName, cVar.a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public boolean a() {
            return this.b.isConnected();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public MediaSessionCompat.Token b() {
            if (this.i == null) {
                this.i = MediaSessionCompat.Token.b(this.b.getSessionToken());
            }
            return this.i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void c() {
            Messenger messenger;
            m mVar = this.g;
            if (mVar != null && (messenger = this.h) != null) {
                try {
                    mVar.j(messenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.b, "Remote error unregistering client messenger.");
                }
            }
            this.b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void d(String str, Bundle bundle, d dVar) {
            if (a()) {
                if (this.g == null) {
                    Log.i(MediaBrowserCompat.b, "The connected service doesn't support sendCustomAction.");
                    if (dVar != null) {
                        this.d.post(new f(dVar, str, bundle));
                    }
                }
                try {
                    this.g.h(str, bundle, new CustomActionResultReceiver(str, bundle, dVar, this.d), this.h);
                    return;
                } catch (RemoteException e2) {
                    Log.i(MediaBrowserCompat.b, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e2);
                    if (dVar != null) {
                        this.d.post(new RunnableC0000g(dVar, str, bundle));
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void e(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.h == messenger) {
                n nVar = this.e.get(str);
                if (nVar == null) {
                    if (MediaBrowserCompat.c) {
                        Log.d(MediaBrowserCompat.b, "onLoadChildren for id that isn't subscribed id=" + str);
                        return;
                    }
                    return;
                }
                o a2 = nVar.a(bundle);
                if (a2 != null) {
                    if (bundle == null) {
                        if (list == null) {
                            a2.c(str);
                            return;
                        }
                        this.j = bundle2;
                        a2.a(str, list);
                        this.j = null;
                    } else if (list == null) {
                        a2.d(str, bundle);
                    } else {
                        this.j = bundle2;
                        a2.b(str, list, bundle);
                        this.j = null;
                    }
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void f() {
            this.b.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void g() {
            try {
                Bundle extras = this.b.getExtras();
                if (extras != null) {
                    this.f = extras.getInt(C10758xe1.r, 0);
                    IBinder a2 = C7136ir.a(extras, C10758xe1.s);
                    if (a2 != null) {
                        this.g = new m(a2, this.c);
                        Messenger messenger = new Messenger(this.d);
                        this.h = messenger;
                        this.d.a(messenger);
                        try {
                            this.g.e(this.a, this.h);
                        } catch (RemoteException unused) {
                            Log.i(MediaBrowserCompat.b, "Remote error registering client messenger.");
                        }
                    }
                    android.support.v4.media.session.b O0 = b.AbstractBinderC0005b.O0(C7136ir.a(extras, C10758xe1.t));
                    if (O0 != null) {
                        this.i = MediaSessionCompat.Token.c(this.b.getSessionToken(), O0);
                    }
                }
            } catch (IllegalStateException e2) {
                Log.e(MediaBrowserCompat.b, "Unexpected IllegalStateException", e2);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public Bundle getExtras() {
            return this.b.getExtras();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public String getRoot() {
            return this.b.getRoot();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void h() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void i(String str, Bundle bundle, l lVar) {
            if (a()) {
                if (this.g == null) {
                    Log.i(MediaBrowserCompat.b, "The connected service doesn't support search.");
                    this.d.post(new d(lVar, str, bundle));
                    return;
                }
                try {
                    this.g.g(str, bundle, new SearchResultReceiver(str, bundle, lVar, this.d), this.h);
                    return;
                } catch (RemoteException e2) {
                    Log.i(MediaBrowserCompat.b, "Remote error searching items with query: " + str, e2);
                    this.d.post(new e(lVar, str, bundle));
                    return;
                }
            }
            throw new IllegalStateException("search() called while not connected");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void j(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public ComponentName k() {
            return this.b.getServiceComponent();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void l(String str, e eVar) {
            if (!TextUtils.isEmpty(str)) {
                if (eVar != null) {
                    if (!this.b.isConnected()) {
                        Log.i(MediaBrowserCompat.b, "Not connected, unable to retrieve the MediaItem.");
                        this.d.post(new a(eVar, str));
                        return;
                    } else if (this.g == null) {
                        this.d.post(new b(eVar, str));
                        return;
                    } else {
                        try {
                            this.g.d(str, new ItemReceiver(str, eVar, this.d), this.h);
                            return;
                        } catch (RemoteException unused) {
                            Log.i(MediaBrowserCompat.b, "Remote error getting media item: " + str);
                            this.d.post(new c(eVar, str));
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("cb is null");
            }
            throw new IllegalArgumentException("mediaId is empty");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void m() {
            this.g = null;
            this.h = null;
            this.i = null;
            this.d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void n(String str, Bundle bundle, o oVar) {
            Bundle bundle2;
            n nVar = this.e.get(str);
            if (nVar == null) {
                nVar = new n();
                this.e.put(str, nVar);
            }
            oVar.e(nVar);
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            nVar.e(bundle2, oVar);
            m mVar = this.g;
            if (mVar == null) {
                this.b.subscribe(str, oVar.a);
                return;
            }
            try {
                mVar.a(str, oVar.b, bundle2, this.h);
            } catch (RemoteException unused) {
                Log.i(MediaBrowserCompat.b, "Remote error subscribing media item: " + str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void o(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void p(String str, o oVar) {
            n nVar = this.e.get(str);
            if (nVar != null) {
                m mVar = this.g;
                if (mVar == null) {
                    if (oVar == null) {
                        this.b.unsubscribe(str);
                    } else {
                        List<o> b2 = nVar.b();
                        List<Bundle> c2 = nVar.c();
                        for (int size = b2.size() - 1; size >= 0; size--) {
                            if (b2.get(size) == oVar) {
                                b2.remove(size);
                                c2.remove(size);
                            }
                        }
                        if (b2.size() == 0) {
                            this.b.unsubscribe(str);
                        }
                    }
                } else {
                    try {
                        if (oVar == null) {
                            mVar.f(str, null, this.h);
                        } else {
                            List<o> b3 = nVar.b();
                            List<Bundle> c3 = nVar.c();
                            for (int size2 = b3.size() - 1; size2 >= 0; size2--) {
                                if (b3.get(size2) == oVar) {
                                    this.g.f(str, oVar.b, this.h);
                                    b3.remove(size2);
                                    c3.remove(size2);
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                        Log.d(MediaBrowserCompat.b, "removeSubscription failed with RemoteException parentId=" + str);
                    }
                }
                if (nVar.d() || oVar == null) {
                    this.e.remove(str);
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public Bundle q() {
            return this.j;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public h(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g, android.support.v4.media.MediaBrowserCompat.f
        public void l(String str, e eVar) {
            if (this.g == null) {
                this.b.getItem(str, eVar.a);
            } else {
                super.l(str, eVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {
        public i(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g, android.support.v4.media.MediaBrowserCompat.f
        public void n(String str, Bundle bundle, o oVar) {
            if (this.g != null && this.f >= 2) {
                super.n(str, bundle, oVar);
            } else if (bundle == null) {
                this.b.subscribe(str, oVar.a);
            } else {
                this.b.subscribe(str, bundle, oVar.a);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g, android.support.v4.media.MediaBrowserCompat.f
        public void p(String str, o oVar) {
            if (this.g != null && this.f >= 2) {
                super.p(str, oVar);
            } else if (oVar == null) {
                this.b.unsubscribe(str);
            } else {
                this.b.unsubscribe(str, oVar.a);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class j implements f, k {

        /* renamed from: o  reason: collision with root package name */
        public static final int f0o = 0;
        public static final int p = 1;
        public static final int q = 2;
        public static final int r = 3;
        public static final int s = 4;
        public final Context a;
        public final ComponentName b;
        public final c c;
        public final Bundle d;
        public final b e = new b(this);
        public final C2531Be<String, n> f = new C2531Be<>();
        public int g = 1;
        public g h;
        public m i;
        public Messenger j;
        public String k;
        public MediaSessionCompat.Token l;
        public Bundle m;
        public Bundle n;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                j jVar = j.this;
                if (jVar.g != 0) {
                    jVar.g = 2;
                    if (MediaBrowserCompat.c && jVar.h != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + j.this.h);
                    } else if (jVar.i == null) {
                        if (jVar.j == null) {
                            Intent intent = new Intent(AbstractServiceC11001ye1.f1);
                            intent.setComponent(j.this.b);
                            j jVar2 = j.this;
                            jVar2.h = new g();
                            try {
                                j jVar3 = j.this;
                                z = jVar3.a.bindService(intent, jVar3.h, 1);
                            } catch (Exception unused) {
                                Log.e(MediaBrowserCompat.b, "Failed binding to service " + j.this.b);
                                z = false;
                            }
                            if (!z) {
                                j.this.h();
                                j.this.c.b();
                            }
                            if (MediaBrowserCompat.c) {
                                Log.d(MediaBrowserCompat.b, "connect...");
                                j.this.g();
                                return;
                            }
                            return;
                        }
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + j.this.j);
                    } else {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + j.this.i);
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                Messenger messenger = jVar.j;
                if (messenger != null) {
                    try {
                        jVar.i.c(messenger);
                    } catch (RemoteException unused) {
                        Log.w(MediaBrowserCompat.b, "RemoteException during connect for " + j.this.b);
                    }
                }
                j jVar2 = j.this;
                int i = jVar2.g;
                jVar2.h();
                if (i != 0) {
                    j.this.g = i;
                }
                if (MediaBrowserCompat.c) {
                    Log.d(MediaBrowserCompat.b, "disconnect...");
                    j.this.g();
                }
            }
        }

        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ e X;
            public final /* synthetic */ String Y;

            public c(e eVar, String str) {
                this.X = eVar;
                this.Y = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a(this.Y);
            }
        }

        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ e X;
            public final /* synthetic */ String Y;

            public d(e eVar, String str) {
                this.X = eVar;
                this.Y = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a(this.Y);
            }
        }

        /* loaded from: classes.dex */
        public class e implements Runnable {
            public final /* synthetic */ l X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ Bundle Z;

            public e(l lVar, String str, Bundle bundle) {
                this.X = lVar;
                this.Y = str;
                this.Z = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a(this.Y, this.Z);
            }
        }

        /* loaded from: classes.dex */
        public class f implements Runnable {
            public final /* synthetic */ d X;
            public final /* synthetic */ String Y;
            public final /* synthetic */ Bundle Z;

            public f(d dVar, String str, Bundle bundle) {
                this.X = dVar;
                this.Y = str;
                this.Z = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a(this.Y, this.Z, null);
            }
        }

        /* loaded from: classes.dex */
        public class g implements ServiceConnection {

            /* loaded from: classes.dex */
            public class a implements Runnable {
                public final /* synthetic */ ComponentName X;
                public final /* synthetic */ IBinder Y;

                public a(ComponentName componentName, IBinder iBinder) {
                    this.X = componentName;
                    this.Y = iBinder;
                }

                @Override // java.lang.Runnable
                public void run() {
                    boolean z = MediaBrowserCompat.c;
                    if (z) {
                        Log.d(MediaBrowserCompat.b, "MediaServiceConnection.onServiceConnected name=" + this.X + " binder=" + this.Y);
                        j.this.g();
                    }
                    if (g.this.a("onServiceConnected")) {
                        j jVar = j.this;
                        jVar.i = new m(this.Y, jVar.d);
                        j.this.j = new Messenger(j.this.e);
                        j jVar2 = j.this;
                        jVar2.e.a(jVar2.j);
                        j.this.g = 2;
                        if (z) {
                            try {
                                Log.d(MediaBrowserCompat.b, "ServiceCallbacks.onConnect...");
                                j.this.g();
                            } catch (RemoteException unused) {
                                Log.w(MediaBrowserCompat.b, "RemoteException during connect for " + j.this.b);
                                if (MediaBrowserCompat.c) {
                                    Log.d(MediaBrowserCompat.b, "ServiceCallbacks.onConnect...");
                                    j.this.g();
                                    return;
                                }
                                return;
                            }
                        }
                        j jVar3 = j.this;
                        jVar3.i.b(jVar3.a, jVar3.j);
                    }
                }
            }

            /* loaded from: classes.dex */
            public class b implements Runnable {
                public final /* synthetic */ ComponentName X;

                public b(ComponentName componentName) {
                    this.X = componentName;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserCompat.c) {
                        Log.d(MediaBrowserCompat.b, "MediaServiceConnection.onServiceDisconnected name=" + this.X + " this=" + this + " mServiceConnection=" + j.this.h);
                        j.this.g();
                    }
                    if (!g.this.a("onServiceDisconnected")) {
                        return;
                    }
                    j jVar = j.this;
                    jVar.i = null;
                    jVar.j = null;
                    jVar.e.a(null);
                    j jVar2 = j.this;
                    jVar2.g = 4;
                    jVar2.c.c();
                }
            }

            public g() {
            }

            public boolean a(String str) {
                int i;
                j jVar = j.this;
                if (jVar.h == this && (i = jVar.g) != 0 && i != 1) {
                    return true;
                }
                int i2 = jVar.g;
                if (i2 != 0 && i2 != 1) {
                    Log.i(MediaBrowserCompat.b, str + " for " + j.this.b + " with mServiceConnection=" + j.this.h + " this=" + this);
                    return false;
                }
                return false;
            }

            public final void b(Runnable runnable) {
                if (Thread.currentThread() == j.this.e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    j.this.e.post(runnable);
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b(new a(componentName, iBinder));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b(new b(componentName));
            }
        }

        public j(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            Bundle bundle2;
            if (context != null) {
                if (componentName != null) {
                    if (cVar != null) {
                        this.a = context;
                        this.b = componentName;
                        this.c = cVar;
                        if (bundle == null) {
                            bundle2 = null;
                        } else {
                            bundle2 = new Bundle(bundle);
                        }
                        this.d = bundle2;
                        return;
                    }
                    throw new IllegalArgumentException("connection callback must not be null");
                }
                throw new IllegalArgumentException("service component must not be null");
            }
            throw new IllegalArgumentException("context must not be null");
        }

        public static String m(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return "UNKNOWN/" + i;
                            }
                            return "CONNECT_STATE_SUSPENDED";
                        }
                        return "CONNECT_STATE_CONNECTED";
                    }
                    return "CONNECT_STATE_CONNECTING";
                }
                return "CONNECT_STATE_DISCONNECTED";
            }
            return "CONNECT_STATE_DISCONNECTING";
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public boolean a() {
            if (this.g == 3) {
                return true;
            }
            return false;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public MediaSessionCompat.Token b() {
            if (a()) {
                return this.l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.g + C9811tl1.d);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void c() {
            this.g = 0;
            this.e.post(new b());
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void d(String str, Bundle bundle, d dVar) {
            if (a()) {
                try {
                    this.i.h(str, bundle, new CustomActionResultReceiver(str, bundle, dVar, this.e), this.j);
                    return;
                } catch (RemoteException e2) {
                    Log.i(MediaBrowserCompat.b, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e2);
                    if (dVar != null) {
                        this.e.post(new f(dVar, str, bundle));
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void e(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (r(messenger, "onLoadChildren")) {
                boolean z = MediaBrowserCompat.c;
                if (z) {
                    Log.d(MediaBrowserCompat.b, "onLoadChildren for " + this.b + " id=" + str);
                }
                n nVar = this.f.get(str);
                if (nVar == null) {
                    if (z) {
                        Log.d(MediaBrowserCompat.b, "onLoadChildren for id that isn't subscribed id=" + str);
                        return;
                    }
                    return;
                }
                o a2 = nVar.a(bundle);
                if (a2 != null) {
                    if (bundle == null) {
                        if (list == null) {
                            a2.c(str);
                            return;
                        }
                        this.n = bundle2;
                        a2.a(str, list);
                        this.n = null;
                    } else if (list == null) {
                        a2.d(str, bundle);
                    } else {
                        this.n = bundle2;
                        a2.b(str, list, bundle);
                        this.n = null;
                    }
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void f() {
            int i = this.g;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + m(this.g) + C9811tl1.d);
            }
            this.g = 2;
            this.e.post(new a());
        }

        public void g() {
            Log.d(MediaBrowserCompat.b, "MediaBrowserCompat...");
            Log.d(MediaBrowserCompat.b, "  mServiceComponent=" + this.b);
            Log.d(MediaBrowserCompat.b, "  mCallback=" + this.c);
            Log.d(MediaBrowserCompat.b, "  mRootHints=" + this.d);
            Log.d(MediaBrowserCompat.b, "  mState=" + m(this.g));
            Log.d(MediaBrowserCompat.b, "  mServiceConnection=" + this.h);
            Log.d(MediaBrowserCompat.b, "  mServiceBinderWrapper=" + this.i);
            Log.d(MediaBrowserCompat.b, "  mCallbacksMessenger=" + this.j);
            Log.d(MediaBrowserCompat.b, "  mRootId=" + this.k);
            Log.d(MediaBrowserCompat.b, "  mMediaSessionToken=" + this.l);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public Bundle getExtras() {
            if (a()) {
                return this.m;
            }
            throw new IllegalStateException("getExtras() called while not connected (state=" + m(this.g) + C9811tl1.d);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public String getRoot() {
            if (a()) {
                return this.k;
            }
            throw new IllegalStateException("getRoot() called while not connected(state=" + m(this.g) + C9811tl1.d);
        }

        public void h() {
            g gVar = this.h;
            if (gVar != null) {
                this.a.unbindService(gVar);
            }
            this.g = 1;
            this.h = null;
            this.i = null;
            this.j = null;
            this.e.a(null);
            this.k = null;
            this.l = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void i(String str, Bundle bundle, l lVar) {
            if (a()) {
                try {
                    this.i.g(str, bundle, new SearchResultReceiver(str, bundle, lVar, this.e), this.j);
                    return;
                } catch (RemoteException e2) {
                    Log.i(MediaBrowserCompat.b, "Remote error searching items with query: " + str, e2);
                    this.e.post(new e(lVar, str, bundle));
                    return;
                }
            }
            throw new IllegalStateException("search() called while not connected (state=" + m(this.g) + C9811tl1.d);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void j(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (r(messenger, "onConnect")) {
                if (this.g != 2) {
                    Log.w(MediaBrowserCompat.b, "onConnect from service while mState=" + m(this.g) + "... ignoring");
                    return;
                }
                this.k = str;
                this.l = token;
                this.m = bundle;
                this.g = 3;
                if (MediaBrowserCompat.c) {
                    Log.d(MediaBrowserCompat.b, "ServiceCallbacks.onConnect...");
                    g();
                }
                this.c.a();
                try {
                    for (Map.Entry<String, n> entry : this.f.entrySet()) {
                        String key = entry.getKey();
                        n value = entry.getValue();
                        List<o> b2 = value.b();
                        List<Bundle> c2 = value.c();
                        for (int i = 0; i < b2.size(); i++) {
                            this.i.a(key, b2.get(i).b, c2.get(i), this.j);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.b, "addSubscription failed with RemoteException.");
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public ComponentName k() {
            if (a()) {
                return this.b;
            }
            throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.g + C9811tl1.d);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void l(String str, e eVar) {
            if (!TextUtils.isEmpty(str)) {
                if (eVar != null) {
                    if (!a()) {
                        Log.i(MediaBrowserCompat.b, "Not connected, unable to retrieve the MediaItem.");
                        this.e.post(new c(eVar, str));
                        return;
                    }
                    try {
                        this.i.d(str, new ItemReceiver(str, eVar, this.e), this.j);
                        return;
                    } catch (RemoteException unused) {
                        Log.i(MediaBrowserCompat.b, "Remote error getting media item: " + str);
                        this.e.post(new d(eVar, str));
                        return;
                    }
                }
                throw new IllegalArgumentException("cb is null");
            }
            throw new IllegalArgumentException("mediaId is empty");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void n(String str, Bundle bundle, o oVar) {
            Bundle bundle2;
            n nVar = this.f.get(str);
            if (nVar == null) {
                nVar = new n();
                this.f.put(str, nVar);
            }
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            nVar.e(bundle2, oVar);
            if (a()) {
                try {
                    this.i.a(str, oVar.b, bundle2, this.j);
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.b, "addSubscription failed with RemoteException parentId=" + str);
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.k
        public void o(Messenger messenger) {
            Log.e(MediaBrowserCompat.b, "onConnectFailed for " + this.b);
            if (!r(messenger, "onConnectFailed")) {
                return;
            }
            if (this.g != 2) {
                Log.w(MediaBrowserCompat.b, "onConnect from service while mState=" + m(this.g) + "... ignoring");
                return;
            }
            h();
            this.c.b();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public void p(String str, o oVar) {
            n nVar = this.f.get(str);
            if (nVar != null) {
                try {
                    if (oVar == null) {
                        if (a()) {
                            this.i.f(str, null, this.j);
                        }
                    } else {
                        List<o> b2 = nVar.b();
                        List<Bundle> c2 = nVar.c();
                        for (int size = b2.size() - 1; size >= 0; size--) {
                            if (b2.get(size) == oVar) {
                                if (a()) {
                                    this.i.f(str, oVar.b, this.j);
                                }
                                b2.remove(size);
                                c2.remove(size);
                            }
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.b, "removeSubscription failed with RemoteException parentId=" + str);
                }
                if (nVar.d() || oVar == null) {
                    this.f.remove(str);
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f
        public Bundle q() {
            return this.n;
        }

        public final boolean r(Messenger messenger, String str) {
            int i;
            if (this.j == messenger && (i = this.g) != 0 && i != 1) {
                return true;
            }
            int i2 = this.g;
            if (i2 != 0 && i2 != 1) {
                Log.i(MediaBrowserCompat.b, str + " for " + this.b + " with mCallbacksMessenger=" + this.j + " this=" + this);
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void e(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        void j(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void o(Messenger messenger);
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public void a(String str, Bundle bundle) {
        }

        public void b(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    /* loaded from: classes.dex */
    public static class m {
        public Messenger a;
        public Bundle b;

        public m(IBinder iBinder, Bundle bundle) {
            this.a = new Messenger(iBinder);
            this.b = bundle;
        }

        public void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C10758xe1.d, str);
            C7136ir.b(bundle2, C10758xe1.a, iBinder);
            bundle2.putBundle(C10758xe1.g, bundle);
            i(3, bundle2, messenger);
        }

        public void b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C10758xe1.i, context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle(C10758xe1.k, this.b);
            i(1, bundle, messenger);
        }

        public void c(Messenger messenger) throws RemoteException {
            i(2, null, messenger);
        }

        public void d(String str, XT1 xt1, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C10758xe1.d, str);
            bundle.putParcelable(C10758xe1.j, xt1);
            i(5, bundle, messenger);
        }

        public void e(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C10758xe1.i, context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle(C10758xe1.k, this.b);
            i(6, bundle, messenger);
        }

        public void f(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(C10758xe1.d, str);
            C7136ir.b(bundle, C10758xe1.a, iBinder);
            i(4, bundle, messenger);
        }

        public void g(String str, Bundle bundle, XT1 xt1, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C10758xe1.m, str);
            bundle2.putBundle(C10758xe1.l, bundle);
            bundle2.putParcelable(C10758xe1.j, xt1);
            i(8, bundle2, messenger);
        }

        public void h(String str, Bundle bundle, XT1 xt1, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C10758xe1.n, str);
            bundle2.putBundle(C10758xe1.f910o, bundle);
            bundle2.putParcelable(C10758xe1.j, xt1);
            i(9, bundle2, messenger);
        }

        public final void i(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.a.send(obtain);
        }

        public void j(Messenger messenger) throws RemoteException {
            i(7, null, messenger);
        }
    }

    /* loaded from: classes.dex */
    public static class n {
        public final List<o> a = new ArrayList();
        public final List<Bundle> b = new ArrayList();

        public o a(Bundle bundle) {
            for (int i = 0; i < this.b.size(); i++) {
                if (C10515we1.a(this.b.get(i), bundle)) {
                    return this.a.get(i);
                }
            }
            return null;
        }

        public List<o> b() {
            return this.a;
        }

        public List<Bundle> c() {
            return this.b;
        }

        public boolean d() {
            return this.a.isEmpty();
        }

        public void e(Bundle bundle, o oVar) {
            for (int i = 0; i < this.b.size(); i++) {
                if (C10515we1.a(this.b.get(i), bundle)) {
                    this.a.set(i, oVar);
                    return;
                }
            }
            this.a.add(oVar);
            this.b.add(bundle);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        public final MediaBrowser.SubscriptionCallback a;
        public final IBinder b = new Binder();
        public WeakReference<n> c;

        /* loaded from: classes.dex */
        public class a extends MediaBrowser.SubscriptionCallback {
            public a() {
            }

            public List<MediaItem> a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt(MediaBrowserCompat.d, -1);
                int i2 = bundle.getInt(MediaBrowserCompat.e, -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i >= 0 && i2 >= 1 && i3 < list.size()) {
                    if (i4 > list.size()) {
                        i4 = list.size();
                    }
                    return list.subList(i3, i4);
                }
                return Collections.EMPTY_LIST;
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                n nVar;
                WeakReference<n> weakReference = o.this.c;
                if (weakReference == null) {
                    nVar = null;
                } else {
                    nVar = weakReference.get();
                }
                if (nVar == null) {
                    o.this.a(str, MediaItem.b(list));
                    return;
                }
                List<MediaItem> b = MediaItem.b(list);
                List<o> b2 = nVar.b();
                List<Bundle> c = nVar.c();
                for (int i = 0; i < b2.size(); i++) {
                    Bundle bundle = c.get(i);
                    if (bundle == null) {
                        o.this.a(str, b);
                    } else {
                        o.this.b(str, a(b, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
                o.this.c(str);
            }
        }

        /* loaded from: classes.dex */
        public class b extends a {
            public b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                o.this.b(str, MediaItem.b(list), bundle);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                o.this.d(str, bundle);
            }
        }

        public o() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a = new b();
            } else {
                this.a = new a();
            }
        }

        public void a(String str, List<MediaItem> list) {
        }

        public void b(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void c(String str) {
        }

        public void d(String str, Bundle bundle) {
        }

        public void e(n nVar) {
            this.c = new WeakReference<>(nVar);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, c cVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new i(context, componentName, cVar, bundle);
        } else {
            this.a = new h(context, componentName, cVar, bundle);
        }
    }

    public void a() {
        Log.d(b, "Connecting to a MediaBrowserService.");
        this.a.f();
    }

    public void b() {
        this.a.c();
    }

    public Bundle c() {
        return this.a.getExtras();
    }

    public void d(String str, e eVar) {
        this.a.l(str, eVar);
    }

    public Bundle e() {
        return this.a.q();
    }

    public String f() {
        return this.a.getRoot();
    }

    public ComponentName g() {
        return this.a.k();
    }

    public MediaSessionCompat.Token h() {
        return this.a.b();
    }

    public boolean i() {
        return this.a.a();
    }

    public void j(String str, Bundle bundle, l lVar) {
        if (!TextUtils.isEmpty(str)) {
            if (lVar != null) {
                this.a.i(str, bundle, lVar);
                return;
            }
            throw new IllegalArgumentException("callback cannot be null");
        }
        throw new IllegalArgumentException("query cannot be empty");
    }

    public void k(String str, Bundle bundle, d dVar) {
        if (!TextUtils.isEmpty(str)) {
            this.a.d(str, bundle, dVar);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }

    public void l(String str, Bundle bundle, o oVar) {
        if (!TextUtils.isEmpty(str)) {
            if (oVar != null) {
                if (bundle != null) {
                    this.a.n(str, bundle, oVar);
                    return;
                }
                throw new IllegalArgumentException("options are null");
            }
            throw new IllegalArgumentException("callback is null");
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void m(String str, o oVar) {
        if (!TextUtils.isEmpty(str)) {
            if (oVar != null) {
                this.a.n(str, null, oVar);
                return;
            }
            throw new IllegalArgumentException("callback is null");
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void n(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a.p(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void o(String str, o oVar) {
        if (!TextUtils.isEmpty(str)) {
            if (oVar != null) {
                this.a.p(str, oVar);
                return;
            }
            throw new IllegalArgumentException("callback is null");
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        public static final int Y0 = 2;
        public static final int Z = 1;
        public final int X;
        public final MediaDescriptionCompat Y;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat != null) {
                if (!TextUtils.isEmpty(mediaDescriptionCompat.g())) {
                    this.X = i;
                    this.Y = mediaDescriptionCompat;
                    return;
                }
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            throw new IllegalArgumentException("description cannot be null");
        }

        public static MediaItem a(Object obj) {
            if (obj != null) {
                MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
                return new MediaItem(MediaDescriptionCompat.a(a.a(mediaItem)), a.b(mediaItem));
            }
            return null;
        }

        public static List<MediaItem> b(List<?> list) {
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
            return this.Y;
        }

        public int d() {
            return this.X;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String e() {
            return this.Y.g();
        }

        public boolean f() {
            if ((this.X & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean g() {
            if ((this.X & 2) != 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.X + ", mDescription=" + this.Y + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.X);
            this.Y.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.X = parcel.readInt();
            this.Y = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
