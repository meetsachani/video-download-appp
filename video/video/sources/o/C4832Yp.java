package o;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.browser.browseractions.BrowserActionsFallbackMenuView;
import java.util.ArrayList;
import java.util.List;
import o.GM1;

@Deprecated
/* renamed from: o.Yp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4832Yp implements AdapterView.OnItemClickListener {
    public static final String a1 = "BrowserActionskMenuUi";
    public final Context X;
    public final Uri Y;
    public d Y0;
    public final List<C4541Vp> Z;
    public DialogC4735Xp Z0;

    /* renamed from: o.Yp$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ClipboardManager) C4832Yp.this.X.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("url", C4832Yp.this.Y.toString()));
            Toast.makeText(C4832Yp.this.X, C4832Yp.this.X.getString(GM1.e.copy_toast_msg), 0).show();
        }
    }

    /* renamed from: o.Yp$b */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnShowListener {
        public final /* synthetic */ View a;

        public b(View view) {
            this.a = view;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            d dVar = C4832Yp.this.Y0;
            if (dVar == null) {
                Log.e(C4832Yp.a1, "Cannot trigger menu item listener, it is null");
            } else {
                dVar.a(this.a);
            }
        }
    }

    /* renamed from: o.Yp$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ TextView X;

        public c(TextView textView) {
            this.X = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C4930Zm2.k(this.X) == Integer.MAX_VALUE) {
                this.X.setMaxLines(1);
                this.X.setEllipsize(TextUtils.TruncateAt.END);
                return;
            }
            this.X.setMaxLines(Integer.MAX_VALUE);
            this.X.setEllipsize(null);
        }
    }

    /* renamed from: o.Yp$d */
    /* loaded from: classes.dex */
    public interface d {
        void a(View view);
    }

    public C4832Yp(Context context, Uri uri, List<C4541Vp> list) {
        this.X = context;
        this.Y = uri;
        this.Z = b(list);
    }

    public final Runnable a() {
        return new a();
    }

    public final List<C4541Vp> b(List<C4541Vp> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4541Vp(this.X.getString(GM1.e.fallback_menu_item_open_in_browser), c()));
        arrayList.add(new C4541Vp(this.X.getString(GM1.e.fallback_menu_item_copy_link), a()));
        arrayList.add(new C4541Vp(this.X.getString(GM1.e.fallback_menu_item_share_link), d()));
        arrayList.addAll(list);
        return arrayList;
    }

    public final PendingIntent c() {
        return PendingIntent.getActivity(this.X, 0, new Intent("android.intent.action.VIEW", this.Y), 67108864);
    }

    public final PendingIntent d() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.Y.toString());
        intent.setType("text/plain");
        return PendingIntent.getActivity(this.X, 0, intent, 67108864);
    }

    public void e() {
        View inflate = LayoutInflater.from(this.X).inflate(GM1.d.a, (ViewGroup) null);
        DialogC4735Xp dialogC4735Xp = new DialogC4735Xp(this.X, f(inflate));
        this.Z0 = dialogC4735Xp;
        dialogC4735Xp.setContentView(inflate);
        if (this.Y0 != null) {
            this.Z0.setOnShowListener(new b(inflate));
        }
        this.Z0.show();
    }

    public final BrowserActionsFallbackMenuView f(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(GM1.c.e);
        TextView textView = (TextView) view.findViewById(GM1.c.a);
        textView.setText(this.Y.toString());
        textView.setOnClickListener(new c(textView));
        ListView listView = (ListView) view.findViewById(GM1.c.d);
        listView.setAdapter((ListAdapter) new C4638Wp(this.Z, this.X));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    public void g(d dVar) {
        this.Y0 = dVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C4541Vp c4541Vp = this.Z.get(i);
        if (c4541Vp.a() != null) {
            try {
                c4541Vp.a().send();
            } catch (PendingIntent.CanceledException e) {
                Log.e(a1, "Failed to send custom item action", e);
            }
        } else if (c4541Vp.d() != null) {
            c4541Vp.d().run();
        }
        DialogC4735Xp dialogC4735Xp = this.Z0;
        if (dialogC4735Xp == null) {
            Log.e(a1, "Cannot dismiss dialog, it has already been dismissed.");
        } else {
            dialogC4735Xp.dismiss();
        }
    }
}
