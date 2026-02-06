package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.messaging.MessagingAnalytics;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import o.C3771Nr1;
import o.C4551Vr1;
import o.C9500sT;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzece extends zzbtd {
    @InterfaceC5056aJ2
    public final Map X = new HashMap();
    public final Context Y;
    public final com.google.android.gms.ads.internal.util.client.zzu Y0;
    public final zzdsd Z;
    public final zzebt Z0;
    public String a1;
    public String b1;

    @InterfaceC5056aJ2
    public zzece(Context context, zzebt zzebtVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzdsd zzdsdVar) {
        this.Y = context;
        this.Z = zzdsdVar;
        this.Y0 = zzuVar;
        this.Z0 = zzebtVar;
    }

    public static /* synthetic */ void X7(zzece zzeceVar, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        zzeceVar.Z0.f(zzeceVar.a1);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeceVar.k8(zzeceVar.a1, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.b();
        }
    }

    public static /* synthetic */ void Y7(zzece zzeceVar, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        zzeceVar.Z0.f(zzeceVar.a1);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeceVar.k8(zzeceVar.a1, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.b();
        }
    }

    public static /* synthetic */ void Z7(zzece zzeceVar, Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzeceVar.k8(zzeceVar.a1, "rtsdc", hashMap);
        activity.startActivity(com.google.android.gms.ads.internal.zzv.w().e(activity));
        zzeceVar.y();
        if (zzmVar != null) {
            zzmVar.b();
        }
    }

    public static /* synthetic */ void a8(zzece zzeceVar, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        zzeceVar.Z0.f(zzeceVar.a1);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeceVar.k8(zzeceVar.a1, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.b();
        }
    }

    public static /* synthetic */ void b8(zzece zzeceVar, Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzeceVar.k8(zzeceVar.a1, "dialog_click", hashMap);
        zzeceVar.l8(activity, zzmVar);
    }

    public static /* synthetic */ void c8(zzece zzeceVar, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        zzeceVar.Z0.f(zzeceVar.a1);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzeceVar.k8(zzeceVar.a1, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.b();
        }
    }

    public static void d8(Context context, zzdsd zzdsdVar, zzebt zzebtVar, String str, String str2) {
        e8(context, zzdsdVar, zzebtVar, str, str2, new HashMap());
    }

    public static void e8(Context context, zzdsd zzdsdVar, zzebt zzebtVar, String str, String str2, Map map) {
        String str3;
        String str4;
        if (true != com.google.android.gms.ads.internal.zzv.t().a(context)) {
            str3 = "offline";
        } else {
            str3 = C9500sT.g;
        }
        if (zzdsdVar != null) {
            zzdsc a = zzdsdVar.a();
            a.b("gqi", str);
            a.b("action", str2);
            a.b("device_connectivity", str3);
            a.b("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzv.d().a()));
            for (Map.Entry entry : map.entrySet()) {
                a.b((String) entry.getKey(), (String) entry.getValue());
            }
            str4 = a.e();
        } else {
            str4 = "";
        }
        zzebtVar.h(new zzebv(com.google.android.gms.ads.internal.zzv.d().a(), str, str4, 2));
    }

    @InterfaceC5056aJ2
    public static final PendingIntent g8(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT >= 29 && str.equals("offline_notification_clicked")) {
            intent.setClassName(context, NotificationHandlerActivity.X);
            return zzfrz.a(context, 0, intent, 201326592);
        }
        intent.setClassName(context, AdService.X);
        ClipData clipData = zzfrz.a;
        return zzfrz.b(context, 0, intent, 1140850688, 0);
    }

    @InterfaceC11300zs1
    public static XmlResourceParser i8(int i) {
        Resources f = com.google.android.gms.ads.internal.zzv.t().f();
        if (f == null) {
            return null;
        }
        try {
            return f.getLayout(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String j8(int i, String str) {
        Resources f = com.google.android.gms.ads.internal.zzv.t().f();
        if (f == null) {
            return str;
        }
        try {
            return f.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    @InterfaceC11300zs1
    private final String t() {
        zzebl zzeblVar = (zzebl) this.X.get(this.a1);
        if (zzeblVar == null) {
            return "";
        }
        return zzeblVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void y() {
        boolean z;
        boolean z2;
        String c;
        try {
            com.google.android.gms.ads.internal.zzv.v();
            Context context = this.Y;
            com.google.android.gms.ads.internal.util.zzbr a = com.google.android.gms.ads.internal.util.zzs.a(context);
            IObjectWrapper V3 = ObjectWrapper.V3(context);
            String str = this.b1;
            String str2 = this.a1;
            zzebl zzeblVar = (zzebl) this.X.get(str2);
            if (zzeblVar == null) {
                c = "";
            } else {
                c = zzeblVar.c();
            }
            z = a.zzg(V3, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, c));
            if (!z) {
                try {
                    z2 = a.zzf(ObjectWrapper.V3(context), this.b1, this.a1);
                } catch (RemoteException e) {
                    e = e;
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.e("Failed to schedule offline notification poster.", e);
                    z2 = z;
                    if (z2) {
                    }
                }
            } else {
                z2 = true;
            }
        } catch (RemoteException e2) {
            e = e2;
            z = false;
        }
        if (z2) {
            this.Z0.f(this.a1);
            k8(this.a1, "offline_notification_worker_not_scheduled", zzfyf.d());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:3)(1:28)|4|(9:8|9|(2:21|22)|11|12|13|14|15|16)|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d7, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d8, code lost:
        r9.put("notification_not_shown_reason", r8.getMessage());
        r8 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbte
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G7(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmap;
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        String str = zzaVar.X;
        String str2 = zzaVar.Y;
        String str3 = zzaVar.Z;
        String t = t();
        com.google.android.gms.ads.internal.zzv.w().g(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent g8 = g8(context, "offline_notification_clicked", str2, str);
        PendingIntent g82 = g8(context, "offline_notification_dismissed", str2, str);
        C3771Nr1.n nVar = new C3771Nr1.n(context, "offline_notification_channel");
        if (!TextUtils.isEmpty(t)) {
            nVar.O(String.format(j8(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), t));
        } else {
            nVar.O(j8(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        }
        nVar.C(true).T(g82).M(g8).t0(context.getApplicationInfo().icon).k0(((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M8)).intValue());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O8)).booleanValue() && !str3.isEmpty()) {
            try {
                bitmap = BitmapFactory.decodeStream(new URL(str3).openConnection().getInputStream());
            } catch (IOException unused) {
            }
            if (bitmap != null) {
                try {
                    nVar.b0(bitmap).z0(new C3771Nr1.k().D(bitmap).B(null));
                } catch (Resources.NotFoundException unused2) {
                }
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(MessagingAnalytics.b);
            HashMap hashMap = new HashMap();
            notificationManager.notify(str2, 54321, nVar.h());
            String str4 = "offline_notification_impression";
            k8(str2, str4, hashMap);
        }
        bitmap = null;
        if (bitmap != null) {
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService(MessagingAnalytics.b);
        HashMap hashMap2 = new HashMap();
        notificationManager2.notify(str2, 54321, nVar.h());
        String str42 = "offline_notification_impression";
        k8(str2, str42, hashMap2);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void Z0(IObjectWrapper iObjectWrapper) {
        zzecg zzecgVar = (zzecg) ObjectWrapper.o1(iObjectWrapper);
        final Activity a = zzecgVar.a();
        final com.google.android.gms.ads.internal.overlay.zzm b = zzecgVar.b();
        this.a1 = zzecgVar.c();
        this.b1 = zzecgVar.d();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.L8)).booleanValue()) {
            k8(this.a1, "dialog_impression", zzfyf.d());
            com.google.android.gms.ads.internal.zzv.v();
            AlertDialog.Builder l = com.google.android.gms.ads.internal.util.zzs.l(a);
            l.setTitle(j8(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(j8(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(j8(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeca
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzece.b8(zzece.this, a, b, dialogInterface, i);
                }
            }).setNegativeButton(j8(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzecb
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzece.a8(zzece.this, b, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecc
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzece.c8(zzece.this, b, dialogInterface);
                }
            });
            l.create().show();
            return;
        }
        l8(a, b);
    }

    public final void f8(String str, zzdio zzdioVar) {
        String k0 = zzdioVar.k0();
        String b = zzdioVar.b();
        String str2 = "";
        if (TextUtils.isEmpty(k0)) {
            if (b == null) {
                k0 = "";
            } else {
                k0 = b;
            }
        }
        zzbgg Z = zzdioVar.Z();
        if (Z != null) {
            try {
                str2 = Z.d().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbgg a0 = zzdioVar.a0();
        Drawable drawable = null;
        if (a0 != null) {
            try {
                IObjectWrapper e = a0.e();
                if (e != null) {
                    drawable = (Drawable) ObjectWrapper.o1(e);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.X.put(str, new zzebh(k0, str2, drawable));
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void h() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.Y0;
        this.Z0.i(new zzffx() { // from class: com.google.android.gms.internal.ads.zzebm
            @Override // com.google.android.gms.internal.ads.zzffx
            public final Object b(Object obj) {
                zzebt.d(com.google.android.gms.ads.internal.util.client.zzu.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final AlertDialog h8(Activity activity, @InterfaceC11300zs1 final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzv.v();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.l(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebw
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.b();
                }
            }
        });
        XmlResourceParser i8 = i8(R.layout.offline_ads_dialog);
        if (i8 == null) {
            onCancelListener.setMessage(j8(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            Drawable drawable = null;
            View inflate = activity.getLayoutInflater().inflate(i8, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String t = t();
            if (!TextUtils.isEmpty(t)) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(t);
            }
            zzebl zzeblVar = (zzebl) this.X.get(this.a1);
            if (zzeblVar != null) {
                drawable = zzeblVar.a();
            }
            if (drawable != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
            }
            AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return create;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(j8(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    public final void k8(String str, String str2, Map map) {
        e8(this.Y, this.Z, this.Z0, str, str2, map);
    }

    public final void l8(final Activity activity, @InterfaceC11300zs1 final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzv.v();
        if (!C4551Vr1.q(activity).a()) {
            if (Build.VERSION.SDK_INT < 33) {
                com.google.android.gms.ads.internal.zzv.v();
                AlertDialog.Builder l = com.google.android.gms.ads.internal.util.zzs.l(activity);
                l.setTitle(j8(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(j8(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebx
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        zzece.Z7(zzece.this, activity, zzmVar, dialogInterface, i);
                    }
                }).setNegativeButton(j8(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeby
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        zzece.X7(zzece.this, zzmVar, dialogInterface, i);
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebz
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        zzece.Y7(zzece.this, zzmVar, dialogInterface);
                    }
                });
                l.create().show();
                k8(this.a1, "rtsdi", zzfyf.d());
                return;
            }
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            k8(this.a1, "asnpdi", zzfyf.d());
            return;
        }
        y();
        m8(activity, zzmVar);
    }

    public final void m8(Activity activity, @InterfaceC11300zs1 com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog h8 = h8(activity, zzmVar);
        h8.show();
        Timer timer = new Timer();
        timer.schedule(new zzecd(this, h8, timer, zzmVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void p6(IObjectWrapper iObjectWrapper, String str, String str2) {
        G7(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void s1(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.Y;
                boolean a = com.google.android.gms.ads.internal.zzv.t().a(context);
                HashMap hashMap = new HashMap();
                char c = 2;
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    if (true == a) {
                        c = 1;
                    }
                    hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        hashMap.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        hashMap.put("olaa", "olaf");
                    }
                } else {
                    hashMap.put("offline_notification_action", "offline_notification_dismissed");
                }
                k8(stringExtra2, "offline_notification_action", hashMap);
                try {
                    SQLiteDatabase writableDatabase = this.Z0.getWritableDatabase();
                    if (c == 1) {
                        this.Z0.k(writableDatabase, this.Y0, stringExtra2);
                    } else {
                        zzebt.m(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e.toString());
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.d(concat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void v2(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzecg zzecgVar = (zzecg) ObjectWrapper.o1(iObjectWrapper);
                Activity a = zzecgVar.a();
                com.google.android.gms.ads.internal.overlay.zzm b = zzecgVar.b();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    y();
                    m8(a, b);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (b != null) {
                        b.b();
                    }
                }
                k8(this.a1, "asnpdc", hashMap);
                return;
            }
        }
    }
}
