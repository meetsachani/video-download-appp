package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Download;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Download.ShowItemActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import o.ActivityC3020Gb;
import o.C4343To;
import o.C4492Vc2;
import o.C4940Zp0;
import o.C5036aE2;
import o.C5971e6;
import o.C6641go1;
import o.C6884ho1;
import o.C7458kA2;
import o.C7743lL0;
import o.C8194n8;
import o.C8322nf1;
import o.C9254rS0;
import o.CY;
import o.G5;
import o.H5;
import o.HA0;
import o.InterfaceC3921Pg0;
import o.P5;
import o.X5;

/* loaded from: classes3.dex */
public class ShowItemActivity extends ActivityC3020Gb {
    public C5971e6 C1;
    public String D1;
    public String E1;
    public InterfaceC3921Pg0 F1;
    public String G1;
    public String H1;
    public final X5<C9254rS0> I1 = X(new P5.n(), new H5() { // from class: o.Q52
        @Override // o.H5
        public final void a(Object obj) {
            ShowItemActivity.F1(ShowItemActivity.this, (G5) obj);
        }
    });

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShowItemActivity.this.onBackPressed();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {

        /* loaded from: classes3.dex */
        public class a implements HA0<Boolean, C7458kA2> {

            /* renamed from: com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Download.ShowItemActivity$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0138a implements MediaScannerConnection.OnScanCompletedListener {

                /* renamed from: com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Download.ShowItemActivity$b$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public class C0139a implements MediaScannerConnection.OnScanCompletedListener {

                    /* renamed from: com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Download.ShowItemActivity$b$a$a$a$a  reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public class C0140a implements MediaScannerConnection.OnScanCompletedListener {
                        public C0140a() {
                        }

                        public static /* synthetic */ void a(C0140a c0140a) {
                            Toast.makeText(ShowItemActivity.this, "Successfully Delete Video", 0).show();
                            ShowItemActivity.this.onBackPressed();
                        }

                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public void onScanCompleted(String str, Uri uri) {
                            ShowItemActivity.this.runOnUiThread(new Runnable() { // from class: o.S52
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ShowItemActivity.b.a.C0138a.C0139a.C0140a.a(ShowItemActivity.b.a.C0138a.C0139a.C0140a.this);
                                }
                            });
                        }
                    }

                    public C0139a() {
                    }

                    public static /* synthetic */ void a(C0139a c0139a) {
                        if (!ShowItemActivity.this.F1.isPlaying() && ShowItemActivity.this.F1 == null) {
                            return;
                        }
                        ShowItemActivity.this.F1.stop();
                    }

                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public void onScanCompleted(String str, Uri uri) {
                        if (uri != null) {
                            ShowItemActivity.this.runOnUiThread(new Runnable() { // from class: o.R52
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ShowItemActivity.b.a.C0138a.C0139a.a(ShowItemActivity.b.a.C0138a.C0139a.this);
                                }
                            });
                            if (Build.VERSION.SDK_INT >= 30) {
                                ShowItemActivity.this.K1(uri);
                                return;
                            }
                            ShowItemActivity.this.L1(str);
                            MediaScannerConnection.scanFile(ShowItemActivity.this, new String[]{str}, null, new C0140a());
                            return;
                        }
                        Log.e("MediaScanner", "Uri is null after scanning file: " + str);
                        Toast.makeText(ShowItemActivity.this, "Failed to get URI for file", 0).show();
                    }
                }

                public C0138a() {
                }

                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str, Uri uri) {
                    File file = new File(ShowItemActivity.this.H1);
                    if (file.exists() && file.isFile()) {
                        MediaScannerConnection.scanFile(ShowItemActivity.this, new String[]{file.getPath()}, null, new C0139a());
                        return;
                    }
                    Toast.makeText(ShowItemActivity.this, "File does not exist", 0).show();
                    Log.e("MediaScanner", "File does not exist: " + file.getPath());
                }
            }

            public a() {
            }

            @Override // o.HA0
            /* renamed from: c */
            public C7458kA2 invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    ShowItemActivity showItemActivity = ShowItemActivity.this;
                    MediaScannerConnection.scanFile(showItemActivity, new String[]{showItemActivity.H1}, null, new C0138a());
                }
                return null;
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C8194n8.a.a(ShowItemActivity.this, new a());
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ShowItemActivity.this.G1.equals("image")) {
                ShowItemActivity showItemActivity = ShowItemActivity.this;
                showItemActivity.N1(showItemActivity.E1, ShowItemActivity.this.G1);
            } else if (ShowItemActivity.this.G1.equals("video")) {
                ShowItemActivity showItemActivity2 = ShowItemActivity.this;
                showItemActivity2.N1(showItemActivity2.H1, ShowItemActivity.this.G1);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                if (ShowItemActivity.this.G1.matches("video")) {
                    ShowItemActivity showItemActivity = ShowItemActivity.this;
                    showItemActivity.M1(showItemActivity.H1);
                    return;
                }
                ShowItemActivity showItemActivity2 = ShowItemActivity.this;
                showItemActivity2.M1(showItemActivity2.E1);
            } else if (ShowItemActivity.this.G1.matches("video")) {
                C4492Vc2.a.a(ShowItemActivity.this.H1, ShowItemActivity.this, "video");
            } else {
                C4492Vc2.a.a(ShowItemActivity.this.E1, ShowItemActivity.this, "image");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ShowItemActivity.this.onBackPressed();
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ShowItemActivity.this.onBackPressed();
        }
    }

    public static /* synthetic */ void F1(ShowItemActivity showItemActivity, G5 g5) {
        showItemActivity.getClass();
        if (g5.b() == -1) {
            showItemActivity.runOnUiThread(new f());
        }
    }

    public void K1(Uri uri) {
        RemoteAction userAction;
        ContentResolver contentResolver = getContentResolver();
        PendingIntent pendingIntent = null;
        try {
            Log.d("uri:==", "DeleteVideo: " + uri);
            contentResolver.delete(uri, null, null);
            Toast.makeText(this, "Successfully Delete Video", 0).show();
            runOnUiThread(new e());
        } catch (SecurityException e2) {
            Log.d("uri:==", "DeleteVideo121: ");
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                Log.d("uri:==", "SDK_INT: ");
                ArrayList arrayList = new ArrayList();
                arrayList.add(uri);
                pendingIntent = MediaStore.createDeleteRequest(contentResolver, arrayList);
            } else if (i >= 29) {
                Log.d("uri:==", "VERSION_CODES: ");
                if (C6641go1.a(e2)) {
                    userAction = C6884ho1.a(e2).getUserAction();
                    pendingIntent = userAction.getActionIntent();
                }
            }
            if (pendingIntent != null) {
                this.I1.b(new C9254rS0.a(pendingIntent.getIntentSender()).a());
                Toast.makeText(this, "Successfully Delete Video", 0).show();
            }
        }
    }

    public void L1(String str) {
        File file = new File(str);
        Log.d("file_delete", "deletefile: " + file.exists());
        if (file.exists() && file.delete()) {
            Toast.makeText(this, "Successfully Delete Video", 0).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:20:0x00b7, B:22:0x00c4, B:25:0x00ca), top: B:36:0x00b7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void M1(String str) {
        String str2;
        Uri contentUri;
        InputStream inputStream;
        String string = getString(R.string.app_name);
        ContentValues contentValues = new ContentValues();
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        if (this.G1.matches("video")) {
            str2 = "VID_" + format + ".mp4";
        } else {
            str2 = "IMG_" + format + C4940Zp0.X;
        }
        contentValues.put("_display_name", str2);
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + RemoteSettings.i + string);
        if (this.G1.matches("video")) {
            contentValues.put(CY.i, "video/*");
            contentUri = MediaStore.Video.Media.getContentUri("external_primary");
        } else {
            contentValues.put(CY.i, "image/*");
            contentUri = MediaStore.Images.Media.getContentUri("external_primary");
        }
        Uri insert = getContentResolver().insert(contentUri, contentValues);
        try {
            inputStream = getContentResolver().openInputStream(Uri.parse(str));
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            inputStream = null;
            C7743lL0.U(inputStream, getContentResolver().openOutputStream(insert));
            if (inputStream != null) {
            }
            Toast.makeText(this, "File saved", 0).show();
        } catch (IOException e3) {
            e3.printStackTrace();
            inputStream = null;
            C7743lL0.U(inputStream, getContentResolver().openOutputStream(insert));
            if (inputStream != null) {
            }
            Toast.makeText(this, "File saved", 0).show();
        }
        try {
            C7743lL0.U(inputStream, getContentResolver().openOutputStream(insert));
            if (inputStream != null) {
                inputStream.close();
            }
            Toast.makeText(this, "File saved", 0).show();
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            try {
                throw th;
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public void N1(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        if (str2.equals("image")) {
            intent.setType("image/jpg");
        } else {
            intent.setType("video/*");
        }
        intent.putExtra("android.intent.extra.TEXT", getString(R.string.share_app_message) + "\nhttps://play.google.com/store/apps/details?id=" + getPackageName());
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(str));
        startActivity(Intent.createChooser(intent, "Share Via"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.F1.isPlaying() || this.F1 != null) {
            this.F1.stop();
        }
        C5036aE2.a(this);
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5971e6 c2 = C5971e6.c(getLayoutInflater());
        this.C1 = c2;
        setContentView(c2.getRoot());
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        this.C1.i.setNavigationOnClickListener(new a());
        this.E1 = getIntent().getStringExtra("imagepath");
        this.G1 = getIntent().getStringExtra("type");
        this.H1 = getIntent().getStringExtra("videopath");
        this.D1 = getIntent().getStringExtra("down");
        this.F1 = new InterfaceC3921Pg0.c(this).w();
        Log.d("TAGSHJSJSJ", "onCreate: " + this.E1);
        Log.d("TAGSHJSJSJ", "onCreate: " + this.H1);
        if (this.G1.equals("image")) {
            this.C1.l.setVisibility(8);
            com.bumptech.glide.a.I(this).r(this.E1).C1(this.C1.e);
        } else if (this.G1.equals("video")) {
            this.C1.e.setVisibility(8);
            this.C1.l.setPlayer(this.F1);
            this.F1.g0(C8322nf1.f(this.H1));
            this.F1.m0();
            this.F1.D0(true);
        }
        String str = this.D1;
        if (str != null && str.equals("down")) {
            this.C1.c.setVisibility(0);
            this.C1.j.setVisibility(8);
        }
        this.C1.c.setOnClickListener(new b());
        this.C1.k.setOnClickListener(new c());
        this.C1.j.setOnClickListener(new d());
    }

    @Override // o.ActivityC3020Gb, o.ActivityC4864Yy0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.F1.isPlaying() && this.F1 == null) {
            return;
        }
        this.F1.stop();
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        C5036aE2.s(this, getClass().getSimpleName(), getClass().getSimpleName());
    }
}
