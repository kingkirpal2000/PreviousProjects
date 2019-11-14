//
//  ViewController.swift
//  Calculator
//
//  Created by Sabir Kirpal on 11/5/19.
//  Copyright © 2019 Sabir Kirpal. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    var screenClear: String = "";
    var theNumber1: Double = 0;
    var theNumber2: Double = 0;
    var mathOperator: Bool = false;
    var numberScreen: String = "";
    var whatMath: String = "";
    
    
    
    
   
    @IBOutlet weak var label: UILabel!
    
    
    @IBAction func Numbers(_ sender: UIButton) {
        //label.text = screenClear
        
        label.text! += String(sender.tag-1)
        if mathOperator == true{
            label.text = (String)(sender.tag-1)
            mathOperator = false
            
            
        }
        
        
        
        
    }
    /*
     Tags:
     Clear = 11
     Equal = 12
     Plus = 13
     Minus = 14
     Times = 15
     Divide = 16
     */
    
    @IBAction func buttons(_ sender: UIButton) {
        
        if sender.tag == 13{
            whatMath = "plus"
            if label.text != ""{
            theNumber1 = (Double)(label.text!)!
            }
            label.text! = "+"
            mathOperator = true
            
        }
        
        if sender.tag == 14{
            whatMath = "minus"
            if label.text != ""{
            theNumber1 = (Double)(label.text!)!
            }
            label.text! = "-"
            mathOperator = true
            
        }
        
        if sender.tag == 15{
            whatMath = "times"
            if label.text != ""{
            theNumber1 = (Double)(label.text!)!
            }
            label.font = UIFont(name: "Helvetica Light", size: 50);
            label.text! = "x"
            mathOperator = true
        }
            
        if sender.tag == 16{
            whatMath = "divide"
            if label.text != ""{
            theNumber1 = (Double)(label.text!)!
            }
            label.text! = "/"
            mathOperator = true
        }
        
        if sender.tag == 11{
            theNumber1 = (Double)(0)
            label.text! = screenClear
            //Figure out if this resets theNumber1 variable or not
        }
        
        if sender.tag == 12{
            theNumber2 = (Double)(label.text!)!
            if whatMath == "plus"{
                label.text = (String)(theNumber1 + theNumber2)
            }
            if whatMath == "minus"{
                label.text = (String)(theNumber1 - theNumber2)
            }
            if whatMath == "times"{
                label.text = (String)(theNumber1 * theNumber2)
            }
            if whatMath == "divide"{
                label.text = (String)(theNumber1 / theNumber2)
            }
        }

        if sender.tag == 17{
            if mathOperator == true{
                label.text = "0"
                mathOperator = false
            }
            label.text! += "."
            
        }
        
    }
    
    
    //18 is on
    //19 is off
    @IBAction func OnButton(_ sender: UIButton) {
        if sender.tag == 18{
            label.font = UIFont(name:"Chalkboard SE", size:20)
            label.text = "  Welcome to The Easy Calculator\t\t\t"
        }
    }
    
    @IBAction func OffButton(_ sender: UIButton) {
        if sender.tag == 19{
            label.font = UIFont(name:"Chalkduster", size:20)
            label.text = "Done so soon? Thank you!!!\t"
        }
    }
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


}

