package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Wizard;
import com.parents.Human;

public class HumanWizard extends Human implements Wizard {

	@Override
	public void changeHealth() {
		super.setHealth(health + 0);

	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 200);

	}

	@Override
	public void setWeapon(Weapon weapon) {
	
		super.setWeapon(Weapon.WAND);
	}
	
	public HumanWizard makeHumanWizard(){
		HumanWizard ourHuWizard = new HumanWizard();
		
		ourHuWizard.changeHealth();
		ourHuWizard.changeMagic();
		ourHuWizard.setHealth(0);
		ourHuWizard.setMagic(0);
		ourHuWizard.setName(null);
		ourHuWizard.setWeapon(null);
		
		return ourHuWizard;
	}
	
	

}
