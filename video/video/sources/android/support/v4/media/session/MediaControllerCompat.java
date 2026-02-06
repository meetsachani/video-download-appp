package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.C10838xy1;
import o.C6350ff1;
import o.C6605gf1;
import o.C7136ir;
import o.C7505kM1;
import o.InterfaceC5283bF2;
import o.UE;

/* loaded from: classes.dex */
public final class MediaControllerCompat {
    public static final String d = "MediaControllerCompat";
    public static final String e = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    public static final String f = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    public static final String g = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    public static final String h = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    public static final String i = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    public static final String j = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    public static final String k = "android.support.v4.media.session.command.ARGUMENT_INDEX";
    public final b a;
    public final MediaSessionCompat.Token b;
    public final ConcurrentHashMap<a, Boolean> c = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public static class MediaControllerImplApi21 implements b {
        public final MediaController a;
        public final Object b = new Object();
        public final List<a> c = new ArrayList();
        public HashMap<a, a> d = new HashMap<>();
        public Bundle e;
        public final MediaSessionCompat.Token f;

        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            public WeakReference<MediaControllerImplApi21> X;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.X = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.X.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.b) {
                        mediaControllerImplApi21.f.g(b.AbstractBinderC0005b.O0(C7136ir.a(bundle, MediaSessionCompat.K)));
                        mediaControllerImplApi21.f.h(C10838xy1.c(bundle, MediaSessionCompat.L));
                        mediaControllerImplApi21.n();
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static class a extends a.c {
            public a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void C6(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void i3() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void l2(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void l3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void t5(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void z4(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f = token;
            this.a = new MediaController(context, (MediaSession.Token) token.f());
            if (token.d() == null) {
                o();
            }
        }

        public static MediaControllerCompat m(Activity activity) {
            MediaController mediaController = activity.getMediaController();
            if (mediaController == null) {
                return null;
            }
            return new MediaControllerCompat(activity, MediaSessionCompat.Token.b(mediaController.getSessionToken()));
        }

        public static void p(Activity activity, MediaControllerCompat mediaControllerCompat) {
            MediaController mediaController;
            if (mediaControllerCompat != null) {
                mediaController = new MediaController(activity, (MediaSession.Token) mediaControllerCompat.t().f());
            } else {
                mediaController = null;
            }
            activity.setMediaController(mediaController);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Bundle C0() {
            if (this.e != null) {
                return new Bundle(this.e);
            }
            if (this.f.d() != null) {
                try {
                    this.e = this.f.d().C0();
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.d, "Dead object in getSessionInfo.", e);
                    this.e = Bundle.EMPTY;
                }
            }
            Bundle G = MediaSessionCompat.G(this.e);
            this.e = G;
            if (G == null) {
                return Bundle.EMPTY;
            }
            return new Bundle(this.e);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int G0() {
            if (this.f.d() != null) {
                try {
                    return this.f.d().G0();
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.d, "Dead object in getShuffleMode.", e);
                    return -1;
                }
            }
            return -1;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean H0() {
            if (this.f.d() != null) {
                try {
                    return this.f.d().H0();
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.d, "Dead object in isCaptioningEnabled.", e);
                    return false;
                }
            }
            return false;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void S0(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((Y() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.j, mediaDescriptionCompat);
                d(MediaControllerCompat.h, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void T0(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((Y() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.j, mediaDescriptionCompat);
                d(MediaControllerCompat.f, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public CharSequence V0() {
            return this.a.getQueueTitle();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackStateCompat X() {
            if (this.f.d() != null) {
                try {
                    return this.f.d().X();
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.d, "Dead object in getPlaybackState.", e);
                }
            }
            PlaybackState playbackState = this.a.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.a(playbackState);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public long Y() {
            return this.a.getFlags();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public e a() {
            MediaController.PlaybackInfo playbackInfo = this.a.getPlaybackInfo();
            if (playbackInfo != null) {
                return new e(playbackInfo.getPlaybackType(), AudioAttributesCompat.j(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void b(a aVar) {
            this.a.unregisterCallback(aVar.a);
            synchronized (this.b) {
                if (this.f.d() != null) {
                    try {
                        a remove = this.d.remove(aVar);
                        if (remove != null) {
                            aVar.c = null;
                            this.f.d().O5(remove);
                        }
                    } catch (RemoteException e) {
                        Log.e(MediaControllerCompat.d, "Dead object in unregisterCallback.", e);
                    }
                } else {
                    this.c.remove(aVar);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if ((Y() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.j, mediaDescriptionCompat);
                bundle.putInt(MediaControllerCompat.k, i);
                d(MediaControllerCompat.g, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.a.sendCommand(str, bundle, resultReceiver);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PendingIntent e() {
            return this.a.getSessionActivity();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public f f() {
            MediaController.TransportControls transportControls = this.a.getTransportControls();
            if (Build.VERSION.SDK_INT >= 29) {
                return new j(transportControls);
            }
            return new i(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void g(int i, int i2) {
            this.a.adjustVolume(i, i2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Bundle getExtras() {
            return this.a.getExtras();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean h(KeyEvent keyEvent) {
            return this.a.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void i(int i, int i2) {
            this.a.setVolumeTo(i, i2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean j() {
            if (this.f.d() != null) {
                return true;
            }
            return false;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Object k() {
            return this.a;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public String k0() {
            return this.a.getPackageName();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void l(a aVar, Handler handler) {
            this.a.registerCallback(aVar.a, handler);
            synchronized (this.b) {
                if (this.f.d() != null) {
                    a aVar2 = new a(aVar);
                    this.d.put(aVar, aVar2);
                    aVar.c = aVar2;
                    try {
                        this.f.d().E4(aVar2);
                        aVar.n(13, null, null);
                    } catch (RemoteException e) {
                        Log.e(MediaControllerCompat.d, "Dead object in registerCallback.", e);
                    }
                } else {
                    aVar.c = null;
                    this.c.add(aVar);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public List<MediaSessionCompat.QueueItem> l1() {
            List<MediaSession.QueueItem> queue = this.a.getQueue();
            if (queue != null) {
                return MediaSessionCompat.QueueItem.b(queue);
            }
            return null;
        }

        public void n() {
            if (this.f.d() == null) {
                return;
            }
            for (a aVar : this.c) {
                a aVar2 = new a(aVar);
                this.d.put(aVar, aVar2);
                aVar.c = aVar2;
                try {
                    this.f.d().E4(aVar2);
                    aVar.n(13, null, null);
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.d, "Dead object in registerCallback.", e);
                }
            }
            this.c.clear();
        }

        public final void o() {
            d(MediaControllerCompat.e, null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public MediaMetadataCompat o0() {
            MediaMetadata metadata = this.a.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.b(metadata);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int w0() {
            if (this.f.d() != null) {
                try {
                    return this.f.d().w0();
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.d, "Dead object in getRepeatMode.", e);
                    return -1;
                }
            }
            return -1;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int y0() {
            return this.a.getRatingType();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a implements IBinder.DeathRecipient {
        public final MediaController.Callback a = new C0001a(this);
        public b b;
        public android.support.v4.media.session.a c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0001a extends MediaController.Callback {
            public final WeakReference<a> a;

            public C0001a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.b(new e(playbackInfo.getPlaybackType(), AudioAttributesCompat.j(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.e(MediaMetadataCompat.b(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = this.a.get();
                if (aVar != null && aVar.c == null) {
                    aVar.f(PlaybackStateCompat.a(playbackState));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.g(MediaSessionCompat.QueueItem.b(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.h(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.j();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.k(str, bundle);
                }
            }
        }

        /* loaded from: classes.dex */
        public class b extends Handler {
            public static final int c = 1;
            public static final int d = 2;
            public static final int e = 3;
            public static final int f = 4;
            public static final int g = 5;
            public static final int h = 6;
            public static final int i = 7;
            public static final int j = 8;
            public static final int k = 9;
            public static final int l = 11;
            public static final int m = 12;
            public static final int n = 13;
            public boolean a;

            public b(Looper looper) {
                super(looper);
                this.a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (!this.a) {
                    return;
                }
                switch (message.what) {
                    case 1:
                        Bundle data = message.getData();
                        MediaSessionCompat.b(data);
                        a.this.k((String) message.obj, data);
                        return;
                    case 2:
                        a.this.f((PlaybackStateCompat) message.obj);
                        return;
                    case 3:
                        a.this.e((MediaMetadataCompat) message.obj);
                        return;
                    case 4:
                        a.this.b((e) message.obj);
                        return;
                    case 5:
                        a.this.g((List) message.obj);
                        return;
                    case 6:
                        a.this.h((CharSequence) message.obj);
                        return;
                    case 7:
                        Bundle bundle = (Bundle) message.obj;
                        MediaSessionCompat.b(bundle);
                        a.this.d(bundle);
                        return;
                    case 8:
                        a.this.j();
                        return;
                    case 9:
                        a.this.i(((Integer) message.obj).intValue());
                        return;
                    case 10:
                    default:
                        return;
                    case 11:
                        a.this.c(((Boolean) message.obj).booleanValue());
                        return;
                    case 12:
                        a.this.m(((Integer) message.obj).intValue());
                        return;
                    case 13:
                        a.this.l();
                        return;
                }
            }
        }

        /* loaded from: classes.dex */
        public static class c extends a.b {
            public final WeakReference<a> j1;

            public c(a aVar) {
                this.j1 = new WeakReference<>(aVar);
            }

            public void C6(CharSequence charSequence) throws RemoteException {
                a aVar = this.j1.get();
                if (aVar != null) {
                    aVar.n(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void I3(int i) throws RemoteException {
                a aVar = this.j1.get();
                if (aVar != null) {
                    aVar.n(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void O7(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                a aVar = this.j1.get();
                if (aVar != null) {
                    aVar.n(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void f1(int i) throws RemoteException {
                a aVar = this.j1.get();
                if (aVar != null) {
                    aVar.n(9, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void g2() throws RemoteException {
                a aVar = this.j1.get();
                if (aVar != null) {
                    aVar.n(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void h6(boolean z) throws RemoteException {
                a aVar = this.j1.get();
                if (aVar != null) {
                    aVar.n(11, Boolean.valueOf(z), null);
                }
            }

            public void i3() throws RemoteException {
                a aVar = this.j1.get();
                if (aVar != null) {
                    aVar.n(8, null, null);
                }
            }

            public void l2(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                a aVar = this.j1.get();
                if (aVar != null) {
                    aVar.n(5, list, null);
                }
            }

            public void l3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                a aVar = this.j1.get();
                if (aVar != null) {
                    aVar.n(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                a aVar = this.j1.get();
                if (aVar != null) {
                    aVar.n(1, str, bundle);
                }
            }

            public void t5(Bundle bundle) throws RemoteException {
                a aVar = this.j1.get();
                if (aVar != null) {
                    aVar.n(7, bundle, null);
                }
            }

            public void z4(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                e eVar;
                a aVar = this.j1.get();
                if (aVar != null) {
                    if (parcelableVolumeInfo != null) {
                        eVar = new e(parcelableVolumeInfo.X, parcelableVolumeInfo.Y, parcelableVolumeInfo.Z, parcelableVolumeInfo.Y0, parcelableVolumeInfo.Z0);
                    } else {
                        eVar = null;
                    }
                    aVar.n(4, eVar, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void z6(boolean z) throws RemoteException {
            }
        }

        public android.support.v4.media.session.a a() {
            return this.c;
        }

        public void b(e eVar) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            n(8, null, null);
        }

        public void c(boolean z) {
        }

        public void d(Bundle bundle) {
        }

        public void e(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void f(PlaybackStateCompat playbackStateCompat) {
        }

        public void g(List<MediaSessionCompat.QueueItem> list) {
        }

        public void h(CharSequence charSequence) {
        }

        public void i(int i) {
        }

        public void j() {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l() {
        }

        public void m(int i) {
        }

        public void n(int i, Object obj, Bundle bundle) {
            b bVar = this.b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public void o(Handler handler) {
            if (handler == null) {
                b bVar = this.b;
                if (bVar != null) {
                    bVar.a = false;
                    bVar.removeCallbacksAndMessages(null);
                    this.b = null;
                    return;
                }
                return;
            }
            b bVar2 = new b(handler.getLooper());
            this.b = bVar2;
            bVar2.a = true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle C0();

        int G0();

        boolean H0();

        void S0(MediaDescriptionCompat mediaDescriptionCompat);

        void T0(MediaDescriptionCompat mediaDescriptionCompat);

        CharSequence V0();

        PlaybackStateCompat X();

        long Y();

        e a();

        void b(a aVar);

        void c(MediaDescriptionCompat mediaDescriptionCompat, int i);

        void d(String str, Bundle bundle, ResultReceiver resultReceiver);

        PendingIntent e();

        f f();

        void g(int i, int i2);

        Bundle getExtras();

        boolean h(KeyEvent keyEvent);

        void i(int i, int i2);

        boolean j();

        Object k();

        String k0();

        void l(a aVar, Handler handler);

        List<MediaSessionCompat.QueueItem> l1();

        MediaMetadataCompat o0();

        int w0();

        int y0();
    }

    /* loaded from: classes.dex */
    public static class c extends MediaControllerImplApi21 {
        public c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.b
        public Bundle C0() {
            if (this.e != null) {
                return new Bundle(this.e);
            }
            Bundle a = C6350ff1.a(this.a);
            this.e = a;
            Bundle G = MediaSessionCompat.G(a);
            this.e = G;
            if (G == null) {
                return Bundle.EMPTY;
            }
            return new Bundle(this.e);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements b {
        public android.support.v4.media.session.b a;
        public f b;
        public Bundle c;

        public d(MediaSessionCompat.Token token) {
            this.a = b.AbstractBinderC0005b.O0((IBinder) token.f());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Bundle C0() {
            try {
                this.c = this.a.C0();
            } catch (RemoteException e) {
                Log.d(MediaControllerCompat.d, "Dead object in getSessionInfo.", e);
            }
            Bundle G = MediaSessionCompat.G(this.c);
            this.c = G;
            if (G == null) {
                return Bundle.EMPTY;
            }
            return new Bundle(this.c);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int G0() {
            try {
                return this.a.G0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in getShuffleMode.", e);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean H0() {
            try {
                return this.a.H0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in isCaptioningEnabled.", e);
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void S0(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.a.Y() & 4) != 0) {
                    this.a.S0(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in removeQueueItem.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void T0(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.a.Y() & 4) != 0) {
                    this.a.T0(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in addQueueItem.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public CharSequence V0() {
            try {
                return this.a.V0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in getQueueTitle.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackStateCompat X() {
            try {
                return this.a.X();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in getPlaybackState.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public long Y() {
            try {
                return this.a.Y();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in getFlags.", e);
                return 0L;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public e a() {
            try {
                ParcelableVolumeInfo v7 = this.a.v7();
                return new e(v7.X, v7.Y, v7.Z, v7.Y0, v7.Z0);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in getPlaybackInfo.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void b(a aVar) {
            if (aVar != null) {
                try {
                    this.a.O5(aVar.c);
                    this.a.asBinder().unlinkToDeath(aVar, 0);
                    return;
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.d, "Dead object in unregisterCallback.", e);
                    return;
                }
            }
            throw new IllegalArgumentException("callback may not be null.");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            try {
                if ((this.a.Y() & 4) != 0) {
                    this.a.k3(mediaDescriptionCompat, i);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in addQueueItemAt.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper;
            try {
                android.support.v4.media.session.b bVar = this.a;
                if (resultReceiver == null) {
                    resultReceiverWrapper = null;
                } else {
                    resultReceiverWrapper = new MediaSessionCompat.ResultReceiverWrapper(resultReceiver);
                }
                bVar.J3(str, bundle, resultReceiverWrapper);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in sendCommand.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PendingIntent e() {
            try {
                return this.a.U1();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in getSessionActivity.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public f f() {
            if (this.b == null) {
                this.b = new k(this.a);
            }
            return this.b;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void g(int i, int i2) {
            try {
                this.a.E6(i, i2, null);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in adjustVolume.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Bundle getExtras() {
            try {
                return this.a.getExtras();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in getExtras.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean h(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.a.Z2(keyEvent);
                    return false;
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.d, "Dead object in dispatchMediaButtonEvent.", e);
                    return false;
                }
            }
            throw new IllegalArgumentException("event may not be null.");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void i(int i, int i2) {
            try {
                this.a.O4(i, i2, null);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in setVolumeTo.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean j() {
            return true;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Object k() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public String k0() {
            try {
                return this.a.k0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in getPackageName.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void l(a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.a.asBinder().linkToDeath(aVar, 0);
                    this.a.E4(aVar.c);
                    aVar.n(13, null, null);
                    return;
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.d, "Dead object in registerCallback.", e);
                    aVar.n(8, null, null);
                    return;
                }
            }
            throw new IllegalArgumentException("callback may not be null.");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public List<MediaSessionCompat.QueueItem> l1() {
            try {
                return this.a.l1();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in getQueue.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public MediaMetadataCompat o0() {
            try {
                return this.a.o0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in getMetadata.", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int w0() {
            try {
                return this.a.w0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in getRepeatMode.", e);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int y0() {
            try {
                return this.a.y0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in getRatingType.", e);
                return 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public static final int f = 1;
        public static final int g = 2;
        public final int a;
        public final AudioAttributesCompat b;
        public final int c;
        public final int d;
        public final int e;

        public e(int i, int i2, int i3, int i4, int i5) {
            this(i, new AudioAttributesCompat.d().d(i2).a(), i3, i4, i5);
        }

        public AudioAttributesCompat a() {
            return this.b;
        }

        @Deprecated
        public int b() {
            return this.b.f();
        }

        public int c() {
            return this.e;
        }

        public int d() {
            return this.d;
        }

        public int e() {
            return this.a;
        }

        public int f() {
            return this.c;
        }

        public e(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.a = i;
            this.b = audioAttributesCompat;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        @Deprecated
        public static final String a = "android.media.session.extra.LEGACY_STREAM_TYPE";

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d(String str, Bundle bundle);

        public abstract void e(String str, Bundle bundle);

        public abstract void f(Uri uri, Bundle bundle);

        public abstract void g();

        public abstract void h(String str, Bundle bundle);

        public abstract void i(String str, Bundle bundle);

        public abstract void j(Uri uri, Bundle bundle);

        public abstract void k();

        public abstract void l(long j);

        public abstract void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

        public abstract void n(String str, Bundle bundle);

        public abstract void o(boolean z);

        public void p(float f) {
        }

        public abstract void q(RatingCompat ratingCompat);

        public abstract void r(RatingCompat ratingCompat, Bundle bundle);

        public abstract void s(int i);

        public abstract void t(int i);

        public abstract void u();

        public abstract void v();

        public abstract void w(long j);

        public abstract void x();
    }

    /* loaded from: classes.dex */
    public static class g extends f {
        public final MediaController.TransportControls b;

        public g(MediaController.TransportControls transportControls) {
            this.b = transportControls;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void a() {
            this.b.fastForward();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void b() {
            this.b.pause();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void c() {
            this.b.play();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void d(String str, Bundle bundle) {
            this.b.playFromMediaId(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void e(String str, Bundle bundle) {
            this.b.playFromSearch(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void f(Uri uri, Bundle bundle) {
            if (uri != null && !Uri.EMPTY.equals(uri)) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(MediaSessionCompat.C, uri);
                bundle2.putBundle(MediaSessionCompat.F, bundle);
                n(MediaSessionCompat.q, bundle2);
                return;
            }
            throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void g() {
            n(MediaSessionCompat.r, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void h(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.A, str);
            bundle2.putBundle(MediaSessionCompat.F, bundle);
            n(MediaSessionCompat.s, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void i(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.B, str);
            bundle2.putBundle(MediaSessionCompat.F, bundle);
            n(MediaSessionCompat.t, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void j(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.C, uri);
            bundle2.putBundle(MediaSessionCompat.F, bundle);
            n(MediaSessionCompat.u, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void k() {
            this.b.rewind();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void l(long j) {
            this.b.seekTo(j);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            MediaControllerCompat.G(customAction.b(), bundle);
            this.b.sendCustomAction(customAction.b(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void n(String str, Bundle bundle) {
            MediaControllerCompat.G(str, bundle);
            this.b.sendCustomAction(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void o(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.G, z);
            n(MediaSessionCompat.v, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void p(float f) {
            if (f != 0.0f) {
                Bundle bundle = new Bundle();
                bundle.putFloat(MediaSessionCompat.E, f);
                n(MediaSessionCompat.z, bundle);
                return;
            }
            throw new IllegalArgumentException("speed must not be zero");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void q(RatingCompat ratingCompat) {
            Rating rating;
            MediaController.TransportControls transportControls = this.b;
            if (ratingCompat != null) {
                rating = (Rating) ratingCompat.c();
            } else {
                rating = null;
            }
            transportControls.setRating(rating);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void r(RatingCompat ratingCompat, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.D, ratingCompat);
            bundle2.putBundle(MediaSessionCompat.F, bundle);
            n(MediaSessionCompat.y, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void s(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.H, i);
            n(MediaSessionCompat.w, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void t(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.I, i);
            n(MediaSessionCompat.x, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void u() {
            this.b.skipToNext();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void v() {
            this.b.skipToPrevious();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void w(long j) {
            this.b.skipToQueueItem(j);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void x() {
            this.b.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public h(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g, android.support.v4.media.session.MediaControllerCompat.f
        public void f(Uri uri, Bundle bundle) {
            this.b.playFromUri(uri, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {
        public i(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g, android.support.v4.media.session.MediaControllerCompat.f
        public void g() {
            this.b.prepare();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g, android.support.v4.media.session.MediaControllerCompat.f
        public void h(String str, Bundle bundle) {
            this.b.prepareFromMediaId(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g, android.support.v4.media.session.MediaControllerCompat.f
        public void i(String str, Bundle bundle) {
            this.b.prepareFromSearch(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g, android.support.v4.media.session.MediaControllerCompat.f
        public void j(Uri uri, Bundle bundle) {
            this.b.prepareFromUri(uri, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends i {
        public j(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g, android.support.v4.media.session.MediaControllerCompat.f
        public void p(float f) {
            if (f != 0.0f) {
                C6605gf1.a(this.b, f);
                return;
            }
            throw new IllegalArgumentException("speed must not be zero");
        }
    }

    /* loaded from: classes.dex */
    public static class k extends f {
        public android.support.v4.media.session.b b;

        public k(android.support.v4.media.session.b bVar) {
            this.b = bVar;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void a() {
            try {
                this.b.Z5();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in fastForward.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void b() {
            try {
                this.b.pause();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in pause.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void c() {
            try {
                this.b.t0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in play.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void d(String str, Bundle bundle) {
            try {
                this.b.y2(str, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in playFromMediaId.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void e(String str, Bundle bundle) {
            try {
                this.b.A2(str, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in playFromSearch.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void f(Uri uri, Bundle bundle) {
            try {
                this.b.I2(uri, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in playFromUri.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void g() {
            try {
                this.b.m0();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in prepare.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void h(String str, Bundle bundle) {
            try {
                this.b.s2(str, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in prepareFromMediaId.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void i(String str, Bundle bundle) {
            try {
                this.b.f5(str, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in prepareFromSearch.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void j(Uri uri, Bundle bundle) {
            try {
                this.b.H1(uri, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in prepareFromUri.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void k() {
            try {
                this.b.P3();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in rewind.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void l(long j) {
            try {
                this.b.Y0(j);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in seekTo.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            n(customAction.b(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void n(String str, Bundle bundle) {
            MediaControllerCompat.G(str, bundle);
            try {
                this.b.w1(str, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in sendCustomAction.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void o(boolean z) {
            try {
                this.b.c1(z);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in setCaptioningEnabled.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void p(float f) {
            if (f != 0.0f) {
                try {
                    this.b.b1(f);
                    return;
                } catch (RemoteException e) {
                    Log.e(MediaControllerCompat.d, "Dead object in setPlaybackSpeed.", e);
                    return;
                }
            }
            throw new IllegalArgumentException("speed must not be zero");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void q(RatingCompat ratingCompat) {
            try {
                this.b.J4(ratingCompat);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in setRating.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void r(RatingCompat ratingCompat, Bundle bundle) {
            try {
                this.b.f3(ratingCompat, bundle);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in setRating.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void s(int i) {
            try {
                this.b.u0(i);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in setRepeatMode.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void t(int i) {
            try {
                this.b.N0(i);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in setShuffleMode.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void u() {
            try {
                this.b.next();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in skipToNext.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void v() {
            try {
                this.b.previous();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in skipToPrevious.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void w(long j) {
            try {
                this.b.h4(j);
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in skipToQueueItem.", e);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f
        public void x() {
            try {
                this.b.stop();
            } catch (RemoteException e) {
                Log.e(MediaControllerCompat.d, "Dead object in stop.", e);
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token i2 = mediaSessionCompat.i();
            this.b = i2;
            if (Build.VERSION.SDK_INT >= 29) {
                this.a = new c(context, i2);
                return;
            } else {
                this.a = new MediaControllerImplApi21(context, i2);
                return;
            }
        }
        throw new IllegalArgumentException("session must not be null");
    }

    public static void D(Activity activity, MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(C7505kM1.b.k, mediaControllerCompat);
        MediaControllerImplApi21.p(activity, mediaControllerCompat);
    }

    public static void G(String str, Bundle bundle) {
        if (str != null) {
            if (str.equals(MediaSessionCompat.j) || str.equals(MediaSessionCompat.k)) {
                if (bundle != null && bundle.containsKey(MediaSessionCompat.l)) {
                    return;
                }
                throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + UE.h);
            }
        }
    }

    public static MediaControllerCompat g(Activity activity) {
        Object tag = activity.getWindow().getDecorView().getTag(C7505kM1.b.k);
        if (tag instanceof MediaControllerCompat) {
            return (MediaControllerCompat) tag;
        }
        return MediaControllerImplApi21.m(activity);
    }

    public void A(MediaDescriptionCompat mediaDescriptionCompat) {
        this.a.S0(mediaDescriptionCompat);
    }

    @Deprecated
    public void B(int i2) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> m = m();
        if (m != null && i2 >= 0 && i2 < m.size() && (queueItem = m.get(i2)) != null) {
            A(queueItem.c());
        }
    }

    public void C(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (!TextUtils.isEmpty(str)) {
            this.a.d(str, bundle, resultReceiver);
            return;
        }
        throw new IllegalArgumentException("command must neither be null nor empty");
    }

    public void E(int i2, int i3) {
        this.a.i(i2, i3);
    }

    public void F(a aVar) {
        if (aVar != null) {
            if (this.c.remove(aVar) == null) {
                Log.w(d, "the callback has never been registered");
                return;
            }
            try {
                this.a.b(aVar);
                return;
            } finally {
                aVar.o(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void a(MediaDescriptionCompat mediaDescriptionCompat) {
        this.a.T0(mediaDescriptionCompat);
    }

    public void b(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
        this.a.c(mediaDescriptionCompat, i2);
    }

    public void c(int i2, int i3) {
        this.a.g(i2, i3);
    }

    public boolean d(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.a.h(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle e() {
        return this.a.getExtras();
    }

    public long f() {
        return this.a.Y();
    }

    public Object h() {
        return this.a.k();
    }

    public MediaMetadataCompat i() {
        return this.a.o0();
    }

    public String j() {
        return this.a.k0();
    }

    public e k() {
        return this.a.a();
    }

    public PlaybackStateCompat l() {
        return this.a.X();
    }

    public List<MediaSessionCompat.QueueItem> m() {
        return this.a.l1();
    }

    public CharSequence n() {
        return this.a.V0();
    }

    public int o() {
        return this.a.y0();
    }

    public int p() {
        return this.a.w0();
    }

    public InterfaceC5283bF2 q() {
        return this.b.e();
    }

    public PendingIntent r() {
        return this.a.e();
    }

    public Bundle s() {
        return this.a.C0();
    }

    public MediaSessionCompat.Token t() {
        return this.b;
    }

    public int u() {
        return this.a.G0();
    }

    public f v() {
        return this.a.f();
    }

    public boolean w() {
        return this.a.H0();
    }

    public boolean x() {
        return this.a.j();
    }

    public void y(a aVar) {
        z(aVar, null);
    }

    public void z(a aVar, Handler handler) {
        if (aVar != null) {
            if (this.c.putIfAbsent(aVar, Boolean.TRUE) != null) {
                Log.w(d, "the callback has already been registered");
                return;
            }
            if (handler == null) {
                handler = new Handler();
            }
            aVar.o(handler);
            this.a.l(aVar, handler);
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.b = token;
            this.a = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
