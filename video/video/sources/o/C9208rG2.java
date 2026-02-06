package o;

import android.media.MediaMetadataRetriever;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.VideoPlayer.VideoListActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: o.rG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9208rG2 extends RecyclerView.AbstractC0370h<c> {
    public final ArrayList<File> d;
    public VideoListActivity e;
    public RT0 f;
    public InterfaceC9116qv1 g;
    public InterfaceC3977Pu1 h;

    /* renamed from: o.rG2$a */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ int X;

        /* renamed from: o.rG2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0332a implements PopupMenu.OnMenuItemClickListener {

            /* renamed from: o.rG2$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0333a implements MediaScannerConnection.OnScanCompletedListener {

                /* renamed from: o.rG2$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public class C0334a implements MediaScannerConnection.OnScanCompletedListener {
                    public C0334a() {
                    }

                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public void onScanCompleted(String str, Uri uri) {
                        Toast.makeText(C9208rG2.this.e, "Successfully Delete Image", 0).show();
                        C9208rG2.this.m();
                    }
                }

                /* renamed from: o.rG2$a$a$a$b */
                /* loaded from: classes3.dex */
                public class b implements Runnable {
                    public b() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        Toast.makeText(C9208rG2.this.e, "Successfully Delete Image", 0).show();
                        C9208rG2.this.m();
                    }
                }

                public C0333a() {
                }

                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str, Uri uri) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        a aVar = a.this;
                        C9208rG2.this.h.a(uri, aVar.X);
                        return;
                    }
                    C9208rG2.this.K(str);
                    MediaScannerConnection.scanFile(C9208rG2.this.e, new String[]{str}, null, new C0334a());
                    C9208rG2.this.e.runOnUiThread(new b());
                }
            }

            public C0332a() {
            }

            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_delete /* 2131362374 */:
                        C9208rG2 c9208rG2 = C9208rG2.this;
                        MediaScannerConnection.scanFile(c9208rG2.e, new String[]{((File) c9208rG2.d.get(a.this.X)).getPath()}, null, new C0333a());
                        return true;
                    case R.id.nav_share /* 2131362375 */:
                        C4492Vc2.a.b(((File) C9208rG2.this.d.get(a.this.X)).getPath(), "video", C9208rG2.this.e);
                        C6562gT0.o(C9208rG2.this.e.getString(R.string.sharing_file), "getString(...)");
                        return true;
                    default:
                        return false;
                }
            }
        }

        public a(int i) {
            this.X = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupMenu popupMenu = new PopupMenu(C9208rG2.this.e, view);
            popupMenu.inflate(R.menu.video_menu);
            popupMenu.setOnMenuItemClickListener(new C0332a());
            popupMenu.show();
        }
    }

    /* renamed from: o.rG2$b */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ int X;

        public b(int i) {
            this.X = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C9208rG2.this.g.L(this.X);
        }
    }

    /* renamed from: o.rG2$c */
    /* loaded from: classes3.dex */
    public static class c extends RecyclerView.H {
        public c(RT0 rt0) {
            super(rt0.getRoot());
            K(false);
        }
    }

    public C9208rG2(VideoListActivity videoListActivity, ArrayList<File> arrayList, InterfaceC9116qv1 interfaceC9116qv1, InterfaceC3977Pu1 interfaceC3977Pu1) {
        this.e = videoListActivity;
        this.d = arrayList;
        this.g = interfaceC9116qv1;
        this.h = interfaceC3977Pu1;
    }

    public static String L(long j) {
        long j2 = (j / 1000) % 60;
        long j3 = (j / 60000) % 60;
        long j4 = j / 3600000;
        if (j4 > 0) {
            return String.format("%02d:%02d:%02d", Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2));
        }
        return String.format("%02d:%02d", Long.valueOf(j3), Long.valueOf(j2));
    }

    public static long M(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                try {
                    mediaMetadataRetriever.release();
                    return parseLong;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                    throw th;
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            try {
                mediaMetadataRetriever.release();
                return 0L;
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public void K(String str) {
        File file = new File(str);
        Log.d("file_delete", "deletefile: " + file.exists());
        if (file.exists() && file.delete()) {
            Toast.makeText(this.e, "Delete Successfully ", 0).show();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: N */
    public void x(@InterfaceC5670cr1 c cVar, int i) {
        this.f.g.setText(LG.a(new File(this.d.get(i).getPath()).length()));
        this.f.e.setText(L(M(this.d.get(i).getPath())));
        com.bumptech.glide.a.I(this.e).r(this.d.get(i).getPath()).e(new C8520oS1().i()).C1(this.f.c);
        this.f.f.setText(this.d.get(i).getName());
        this.f.d.setOnClickListener(new a(i));
        this.f.b.setOnClickListener(new b(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    @InterfaceC5670cr1
    /* renamed from: O */
    public c z(@InterfaceC5670cr1 ViewGroup viewGroup, int i) {
        this.f = RT0.d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new c(this.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int i(int i) {
        return i;
    }
}
