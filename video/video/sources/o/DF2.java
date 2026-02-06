package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Download.ShowItemActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.File;
import java.util.List;
import o.DF2;
import o.I7;

/* loaded from: classes3.dex */
public class DF2 extends RecyclerView.AbstractC0370h<d> {
    public final Activity d;
    public final List<HF2> e;
    public e f;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ HF2 X;

        /* renamed from: o.DF2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0173a implements I7.f {
            public C0173a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                Intent intent = new Intent(DF2.this.d, ShowItemActivity.class);
                intent.putExtra("videopath", a.this.X.h().toString());
                intent.putExtra("type", "video");
                intent.putExtra("down", "down");
                DF2.this.d.startActivity(intent);
            }
        }

        public a(HF2 hf2) {
            this.X = hf2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(DF2.this.d, new C0173a(), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ HF2 X;
        public final /* synthetic */ int Y;

        /* loaded from: classes3.dex */
        public class a implements PopupMenu.OnMenuItemClickListener {
            public a() {
            }

            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                b bVar = b.this;
                return DF2.this.P(bVar.X.h(), b.this.Y, menuItem);
            }
        }

        public b(HF2 hf2, int i) {
            this.X = hf2;
            this.Y = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupMenu popupMenu = new PopupMenu(DF2.this.d, view);
            popupMenu.getMenuInflater().inflate(R.menu.video_menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new a());
            popupMenu.show();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements MediaScannerConnection.OnScanCompletedListener {
        public final /* synthetic */ int a;

        /* loaded from: classes3.dex */
        public class a implements MediaScannerConnection.OnScanCompletedListener {

            /* renamed from: o.DF2$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0174a implements MediaScannerConnection.OnScanCompletedListener {
                public C0174a() {
                }

                public static /* synthetic */ void a(C0174a c0174a) {
                    Toast.makeText(DF2.this.d, "Successfully Delete Video", 0).show();
                    DF2.this.m();
                }

                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str, Uri uri) {
                    DF2.this.d.runOnUiThread(new Runnable() { // from class: o.EF2
                        @Override // java.lang.Runnable
                        public final void run() {
                            DF2.c.a.C0174a.a(DF2.c.a.C0174a.this);
                        }
                    });
                }
            }

            public a() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                if (uri != null) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        c cVar = c.this;
                        DF2.this.f.a(uri, cVar.a);
                        return;
                    }
                    DF2.this.L(str);
                    MediaScannerConnection.scanFile(DF2.this.d, new String[]{str}, null, new C0174a());
                    return;
                }
                Log.e("MediaScanner", "Uri is null after scanning file: " + str);
                Toast.makeText(DF2.this.d, "Failed to get URI for file", 0).show();
            }
        }

        public c(int i) {
            this.a = i;
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            File h = ((HF2) DF2.this.e.get(this.a)).h();
            if (h.exists() && h.isFile()) {
                MediaScannerConnection.scanFile(DF2.this.d, new String[]{h.getPath()}, null, new a());
                return;
            }
            Toast.makeText(DF2.this.d, "File does not exist", 0).show();
            Log.e("MediaScanner", "File does not exist: " + h.getPath());
        }
    }

    /* loaded from: classes3.dex */
    public class d extends RecyclerView.H {
        public ImageView I;
        public ImageView J;
        public ImageView K;
        public TextView L;
        public TextView M;
        public TextView N;

        public d(View view) {
            super(view);
            this.I = (ImageView) view.findViewById(R.id.imgThumbnail);
            this.K = (ImageView) view.findViewById(R.id.ic_play);
            this.N = (TextView) view.findViewById(R.id.tv_file_size);
            this.J = (ImageView) view.findViewById(R.id.ic_vert_menu);
            this.L = (TextView) view.findViewById(R.id.tv_file_duration);
            this.M = (TextView) view.findViewById(R.id.ic_file_title);
        }
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a(Uri uri, int i);
    }

    public DF2(List<HF2> list, Activity activity, e eVar) {
        this.e = list;
        this.d = activity;
        this.f = eVar;
    }

    public void L(String str) {
        File file = new File(str);
        Log.d("file_delete", "deletefile: " + file.exists());
        if (file.exists() && file.delete()) {
            Toast.makeText(this.d, "Delete Successfully ", 0).show();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: N */
    public void x(d dVar, int i) {
        HF2 hf2 = this.e.get(i);
        com.bumptech.glide.a.D(this.d).f(hf2.h()).C1(dVar.I);
        dVar.N.setText(hf2.j());
        dVar.L.setText(hf2.g());
        dVar.M.setText(hf2.i());
        dVar.I.setOnClickListener(new a(hf2));
        dVar.J.setOnClickListener(new b(hf2, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: O */
    public d z(ViewGroup viewGroup, int i) {
        return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.video_downloader_adapter, viewGroup, false));
    }

    public boolean P(File file, int i, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_delete) {
            MediaScannerConnection.scanFile(this.d, new String[]{this.e.get(i).h().getPath()}, null, new c(i));
            return true;
        } else if (itemId == R.id.nav_share) {
            C4492Vc2.a.b(file.getPath(), "video", this.d);
            Q(this.d, this.d.getString(R.string.sharing_file));
            return true;
        } else {
            return false;
        }
    }

    public void Q(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        return this.e.size();
    }

    public void M(HF2 hf2, View view) {
    }
}
