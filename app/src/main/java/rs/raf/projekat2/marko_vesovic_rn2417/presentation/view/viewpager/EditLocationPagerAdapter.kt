package rs.raf.projekat2.marko_vesovic_rn2417.presentation.view.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import rs.raf.projekat2.marko_vesovic_rn2417.presentation.view.fragment.EditLocationMapsFragment
import rs.raf.projekat2.marko_vesovic_rn2417.presentation.view.fragment.MapsFragment

class EditLocationPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return EditLocationMapsFragment()
    }

    override fun getCount(): Int {
        return 1
    }

}