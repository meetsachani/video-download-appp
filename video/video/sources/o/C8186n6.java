package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.VideoView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* renamed from: o.n6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8186n6 implements InterfaceC5776dH2 {
    @InterfaceC5670cr1
    public final ConstraintLayout a;
    @InterfaceC5670cr1
    public final AppCompatImageView b;
    @InterfaceC5670cr1
    public final AppCompatImageView c;
    @InterfaceC5670cr1
    public final AppCompatImageView d;
    @InterfaceC5670cr1
    public final AppCompatImageView e;
    @InterfaceC5670cr1
    public final ConstraintLayout f;
    @InterfaceC5670cr1
    public final ConstraintLayout g;
    @InterfaceC5670cr1
    public final ConstraintLayout h;
    @InterfaceC5670cr1
    public final AppCompatImageView i;
    @InterfaceC5670cr1
    public final AppCompatImageView j;
    @InterfaceC5670cr1
    public final AppCompatImageView k;
    @InterfaceC5670cr1
    public final AppCompatImageView l;
    @InterfaceC5670cr1
    public final AppCompatImageView m;
    @InterfaceC5670cr1
    public final AppCompatImageView n;
    @InterfaceC5670cr1

    /* renamed from: o  reason: collision with root package name */
    public final SeekBar f820o;
    @InterfaceC5670cr1
    public final AppCompatTextView p;
    @InterfaceC5670cr1
    public final AppCompatTextView q;
    @InterfaceC5670cr1
    public final AppCompatTextView r;
    @InterfaceC5670cr1
    public final VideoView s;

    public C8186n6(@InterfaceC5670cr1 ConstraintLayout constraintLayout, @InterfaceC5670cr1 AppCompatImageView appCompatImageView, @InterfaceC5670cr1 AppCompatImageView appCompatImageView2, @InterfaceC5670cr1 AppCompatImageView appCompatImageView3, @InterfaceC5670cr1 AppCompatImageView appCompatImageView4, @InterfaceC5670cr1 ConstraintLayout constraintLayout2, @InterfaceC5670cr1 ConstraintLayout constraintLayout3, @InterfaceC5670cr1 ConstraintLayout constraintLayout4, @InterfaceC5670cr1 AppCompatImageView appCompatImageView5, @InterfaceC5670cr1 AppCompatImageView appCompatImageView6, @InterfaceC5670cr1 AppCompatImageView appCompatImageView7, @InterfaceC5670cr1 AppCompatImageView appCompatImageView8, @InterfaceC5670cr1 AppCompatImageView appCompatImageView9, @InterfaceC5670cr1 AppCompatImageView appCompatImageView10, @InterfaceC5670cr1 SeekBar seekBar, @InterfaceC5670cr1 AppCompatTextView appCompatTextView, @InterfaceC5670cr1 AppCompatTextView appCompatTextView2, @InterfaceC5670cr1 AppCompatTextView appCompatTextView3, @InterfaceC5670cr1 VideoView videoView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = appCompatImageView3;
        this.e = appCompatImageView4;
        this.f = constraintLayout2;
        this.g = constraintLayout3;
        this.h = constraintLayout4;
        this.i = appCompatImageView5;
        this.j = appCompatImageView6;
        this.k = appCompatImageView7;
        this.l = appCompatImageView8;
        this.m = appCompatImageView9;
        this.n = appCompatImageView10;
        this.f820o = seekBar;
        this.p = appCompatTextView;
        this.q = appCompatTextView2;
        this.r = appCompatTextView3;
        this.s = videoView;
    }

    @InterfaceC5670cr1
    public static C8186n6 a(@InterfaceC5670cr1 View view) {
        int i = R.id.btnNext;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6018eH2.a(view, R.id.btnNext);
        if (appCompatImageView != null) {
            i = R.id.btnPlay;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6018eH2.a(view, R.id.btnPlay);
            if (appCompatImageView2 != null) {
                i = R.id.btnPlayPausePIP;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) C6018eH2.a(view, R.id.btnPlayPausePIP);
                if (appCompatImageView3 != null) {
                    i = R.id.btnPrev;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) C6018eH2.a(view, R.id.btnPrev);
                    if (appCompatImageView4 != null) {
                        i = R.id.clBottomActions;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C6018eH2.a(view, R.id.clBottomActions);
                        if (constraintLayout != null) {
                            i = R.id.clControls;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) C6018eH2.a(view, R.id.clControls);
                            if (constraintLayout2 != null) {
                                i = R.id.clProgress;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) C6018eH2.a(view, R.id.clProgress);
                                if (constraintLayout3 != null) {
                                    i = R.id.ivBack;
                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) C6018eH2.a(view, R.id.ivBack);
                                    if (appCompatImageView5 != null) {
                                        i = R.id.ivLock;
                                        AppCompatImageView appCompatImageView6 = (AppCompatImageView) C6018eH2.a(view, R.id.ivLock);
                                        if (appCompatImageView6 != null) {
                                            i = R.id.ivLockRelease;
                                            AppCompatImageView appCompatImageView7 = (AppCompatImageView) C6018eH2.a(view, R.id.ivLockRelease);
                                            if (appCompatImageView7 != null) {
                                                i = R.id.ivPictureInPicture;
                                                AppCompatImageView appCompatImageView8 = (AppCompatImageView) C6018eH2.a(view, R.id.ivPictureInPicture);
                                                if (appCompatImageView8 != null) {
                                                    i = R.id.ivRepeat;
                                                    AppCompatImageView appCompatImageView9 = (AppCompatImageView) C6018eH2.a(view, R.id.ivRepeat);
                                                    if (appCompatImageView9 != null) {
                                                        i = R.id.ivRotation;
                                                        AppCompatImageView appCompatImageView10 = (AppCompatImageView) C6018eH2.a(view, R.id.ivRotation);
                                                        if (appCompatImageView10 != null) {
                                                            i = R.id.seekBar;
                                                            SeekBar seekBar = (SeekBar) C6018eH2.a(view, R.id.seekBar);
                                                            if (seekBar != null) {
                                                                i = R.id.tvEndTimeAudio;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) C6018eH2.a(view, R.id.tvEndTimeAudio);
                                                                if (appCompatTextView != null) {
                                                                    i = R.id.tvStartTimeAudio;
                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6018eH2.a(view, R.id.tvStartTimeAudio);
                                                                    if (appCompatTextView2 != null) {
                                                                        i = R.id.tvTitle;
                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6018eH2.a(view, R.id.tvTitle);
                                                                        if (appCompatTextView3 != null) {
                                                                            i = R.id.videoView;
                                                                            VideoView videoView = (VideoView) C6018eH2.a(view, R.id.videoView);
                                                                            if (videoView != null) {
                                                                                return new C8186n6((ConstraintLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, constraintLayout, constraintLayout2, constraintLayout3, appCompatImageView5, appCompatImageView6, appCompatImageView7, appCompatImageView8, appCompatImageView9, appCompatImageView10, seekBar, appCompatTextView, appCompatTextView2, appCompatTextView3, videoView);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @InterfaceC5670cr1
    public static C8186n6 c(@InterfaceC5670cr1 LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @InterfaceC5670cr1
    public static C8186n6 d(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_video_play, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // o.InterfaceC5776dH2
    @InterfaceC5670cr1
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
